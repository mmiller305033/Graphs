/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_adt;

import java.util.ArrayList;

/**
 *
 * @author Mark Miller
 */
public class UndirectedGraph {

    ArrayList<Vertex> vertices = new ArrayList<>();

    public UndirectedGraph(int[] n, String[] l) {
        for (int i = 0; i < n.length; i++) {
            vertices.add(new Vertex(n[i], l[i]));
        }
    }

    public Vertex findVertex(int number) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getNumber() == number) {
                return vertices.get(i);
            }
        }
        return null;
    }

    public void addConnections(int[] from_vertex, int[] to_vertex) {

        try {
            for (int i = 0; i < from_vertex.length; i++) {
                findVertex(from_vertex[i]).addConnection(findVertex(to_vertex[i]));
            }

        } catch (NullPointerException e) {
            System.out.println("Null!!!");
        }

    }

    public void printUndirectedGraph() {
        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).printConnections();
        }
    }
    
    public int numberOfSubGraphs(){
        return 0;
    }

}
