package it.oltsp.graph;

import it.oltsp.OnlineGraph;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.graph.SimpleWeightedGraph;

@SuppressWarnings("serial")
public class SimpleOnlineGraph<V, E, T extends Comparable<T>> extends SimpleWeightedGraph<V, E> implements OnlineGraph<V, E, T> {

	private Map<V, T> releaseTimes;
	
	public SimpleOnlineGraph(Class<? extends E> edgeClass) {
		super(edgeClass);
		releaseTimes = new HashMap<V, T>();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Graph<V, E> getVisibleGraph(T t) {
		Graph<V, E> visibleGraph = (Graph<V, E>) this.clone();
		for (V v : this.vertexSet() ) {
			
			if (this.getReleaseTime(v).compareTo(t)<0)
				visibleGraph.removeVertex(v);
		}
		return visibleGraph;
	}

	@Override
	public T getReleaseTime(V v) {
		return releaseTimes.get(v);
	}

	@Override
	public void setReleaseTime(V v, T t) {
		releaseTimes.put(v, t);
	}
	
	
}
