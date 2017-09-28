/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_adt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Miller
 */
public class UndirectedGraph {

    private ArrayList<Vertex> vertices = new ArrayList<>();

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

    public List<Vertex> findPathDFS(Vertex Start, Vertex Target) {
        ArrayList<Vertex> Path = new ArrayList<>();

        return Path;
    }

    public List<Vertex> findPathDFS(int Start, int Target) {
        ArrayList<Vertex> Path = new ArrayList<>();

        return Path;
    }

    public List<Vertex> findPathBFS(Vertex Start, Vertex Target) {
        ArrayList<Vertex> Path = new ArrayList<>();

        return Path;
    }

    public List<Vertex> findPathBFS(int Start, int Target) {
        ArrayList<Vertex> Path = new ArrayList<>();

        return Path;
    }

    
    //Prints graph info into two CSV files
    //CSV files are meant to be imported into Gephi0.9.2 for visualization purposes
    public void writeGraphToFile() {
        try {
            PrintWriter writer = new PrintWriter("C:\\Vertexs\\Mark Miller\\Desktop\\edges.csv", "UTF-8");
            writer.println("Source,Target");
            for(int i = 0; i < vertices.size(); i++){
                for(int j = 0; j < vertices.get(i).connections.size(); j++){
                    writer.println(vertices.get(i).getNumber() + "," + vertices.get(i).connections.get(j).getNumber());
                }
            }
            writer.close();
        } catch (IOException e) {
        }
        
        
        try {
            PrintWriter writer = new PrintWriter("C:\\Vertexs\\Mark Miller\\Desktop\\nodes.csv", "UTF-8");
            writer.println("id,label");
            for(int i = 0; i < vertices.size(); i++){
                writer.println(vertices.get(i).getNumber() + "," + vertices.get(i).getLabel());
            }
            writer.close();
        } catch (IOException e) {
        }
    }
    //Overloaded Method
    public void writeGraphToFile(ArrayList<Vertex> v) {
        try {
            PrintWriter writer = new PrintWriter("C:\\Vertexs\\Mark Miller\\Desktop\\edges.csv", "UTF-8");
            writer.println("Source,Target");
            for(int i = 0; i < v.size(); i++){
                for(int j = 0; j < v.get(i).connections.size(); j++){
                    writer.println(v.get(i).getNumber() + "," + v.get(i).connections.get(j).getNumber());
                }
            }
            writer.close();
        } catch (IOException e) {
        }
        try {
            PrintWriter writer = new PrintWriter("C:\\Vertexs\\Mark Miller\\Desktop\\nodes.csv", "UTF-8");
            writer.println("id,label");
            for(int i = 0; i < v.size(); i++){
                writer.println(v.get(i).getNumber() + "," + v.get(i).getLabel());
            }
            writer.close();
        } catch (IOException e) {
        }
    }

}
