package it.oltsp.generate;

import it.oltsp.OnlineGraph;

import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.VertexFactory;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.generate.GraphGenerator;

public class OnlineGraphGenerator<V, E, T> extends CompleteGraphGenerator<V, E>
		implements GraphGenerator<V, E, V> {
	
	private ProbabilityDistributionFunction<T> pbf;
	private T maxReleaseTime;
	
	public OnlineGraphGenerator(int size, T maxReleaseTime, ProbabilityDistributionFunction<T> pbf) {
		super(size);
		this.maxReleaseTime = maxReleaseTime;
		this.pbf = pbf;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void generateGraph(Graph<V, E> target,
			VertexFactory<V> vertexFactory, Map<String, V> resultMap) {
		
		OnlineGraph<V, E, T> online = (OnlineGraph<V, E, T>)target;
		super.generateGraph(target, vertexFactory, resultMap);
		for (V vertex : target.vertexSet()){
			online.setReleaseTime(vertex, pbf.getGeneratedReleaseTime(maxReleaseTime));
		}
	}
}
