
package dk.cphbusiness.algorithm.examples.graphs;

import java.util.Collection;

/**
 *
 * @author Cherry Rose Semeña
 */
public class GraphImpl implements Graph<String, Integer>{
    private Node first;
    
    private class Node {
        Vertex<String, Integer> vertex;
        Node next;

        public Node(Vertex vertex, Node next) {
            this.vertex = vertex;
            this.next = next;
        }

        
    }
    
    public class VertexImpl implements Vertex<String, Integer>{

        @Override
        public String getData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Collection<Edge<String, Integer>> getAdjacentEdges() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public class EdgeImpl implements Edge<String, Integer>{

        @Override
        public Integer getWeight() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Vertex<String, Integer> getHeadVertex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    @Override
    public void addVertex(String... data) {
        Vertex v;
        
    }

    @Override
    public void addEdge(Integer weight, Vertex<String, Integer> tail, Vertex<String, Integer> head, boolean directed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Vertex<String, Integer>> getVertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Edge<String, Integer>> getEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
