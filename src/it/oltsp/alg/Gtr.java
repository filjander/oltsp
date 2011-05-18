package it.oltsp.alg;

import it.oltsp.OnlineGraph;
import it.oltsp.OnlineGraphPath;

import java.util.Map;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.graph.GraphPathImpl;
import org.jgrapht.traverse.ClosestFirstIterator;

public class Gtr<V, E, T> {

	OnlineGraph<V, E, T> onlineGraph;
	V startVertex;
	Set<V> vertexes;

	public Gtr(OnlineGraph<V, E, T> graph, V startVertex) {
		this.onlineGraph = graph;
		this.startVertex = startVertex;
		this.vertexes = graph.vertexSet();
	}
	
	public OnlineGraphPath<V, E, T> getVisitingPath() {

		V actualVertex = startVertex;
		T actualTime = null;
		Graph<V, E> visibleGraph = onlineGraph.getVisibleGraph(actualTime);
		ClosestFirstIterator<V, E> itr = new ClosestFirstIterator<V, E>(visibleGraph, actualVertex);
		if(itr.hasNext())
			itr.next();
		
	    
		
		
		return null; //TODO
	}
}
