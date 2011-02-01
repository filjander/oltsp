package it.oltsp.alg;

import it.oltsp.OnlineGraph;
import it.oltsp.OnlineGraphPath;

import java.util.Map;

import org.jgrapht.GraphPath;
import org.jgrapht.graph.GraphPathImpl;

public class Gtr<V, E, T> {

	OnlineGraph<V, E, T> onlineGraph;

	public Gtr(OnlineGraph<V, E, T> graph) {
		this.onlineGraph = graph;
	}
	
	public OnlineGraphPath<V, E, T> getVisitingPath() {
		return null; //TODO
	}
}
