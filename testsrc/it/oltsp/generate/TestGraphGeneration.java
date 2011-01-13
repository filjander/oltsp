package it.oltsp.generate;

import it.oltsp.OnlineGraph;
import it.oltsp.graph.SimpleOnlineGraph;

import org.jgrapht.VertexFactory;
import org.jgrapht.graph.ClassBasedVertexFactory;
import org.jgrapht.graph.DefaultEdge;
import org.junit.Test;

public class TestGraphGeneration {

	@Test
	public void testGenerateGraph() {
		OnlineGraph<Integer, DefaultEdge, Float> graph = new SimpleOnlineGraph<Integer, DefaultEdge, Float>(DefaultEdge.class);
		OnlineGraphGenerator<Integer, DefaultEdge, Float> gg = new OnlineGraphGenerator<Integer, DefaultEdge, Float>(10, 100F, new ContinuosUniformDistribution());
		gg.generateGraph(graph, new VertexFactory<Integer>() {
            private int i;

            public Integer createVertex()
            {
                return new Integer(++i);
            }
        }, null);
	}

}
