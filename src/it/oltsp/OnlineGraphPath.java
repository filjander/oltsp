package it.oltsp;

import org.jgrapht.GraphPath;

public interface OnlineGraphPath<V, E, T> extends GraphPath<V, E> {
	T getVisitedTime(E e);
}
