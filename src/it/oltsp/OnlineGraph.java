package it.oltsp;

import org.jgrapht.Graph;
import org.jgrapht.WeightedGraph;

public interface OnlineGraph<V, E, T> extends WeightedGraph<V, E> {
	
	/**
	 * Get the graph visible at time @param t
	 * @param t
	 * @return
	 */
	public Graph<V, E> getVisibleGraph(T t);
	public T getReleaseTime(V v);
	public void setReleaseTime(V v, T t);
}
