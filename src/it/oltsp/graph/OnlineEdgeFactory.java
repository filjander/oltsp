package it.oltsp.graph;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ClassBasedEdgeFactory;

@SuppressWarnings("serial")
public class OnlineEdgeFactory<V, E> extends ClassBasedEdgeFactory<V, E> implements EdgeFactory<V, E>  {

	public OnlineEdgeFactory(Class<? extends E> arg0) {
		super(arg0);
	}

	@Override
	public E createEdge(V arg0, V arg1) {
		return super.createEdge(arg0, arg1);
	}

}
