/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_adt;

import java.util.Random;

/**
 *
 * @author Mark Miller
 */
public class Graph_ADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Undirected Graph Code Below
        
        Random rand = new Random();

        int [] n = new int [2500];
        String [] l = new String [2500];
        int [] from_vertex = new int[1500];
        int [] to_vertex = new int[1500];
        
        for(int i = 0; i < n.length; i++){
            n[i] = i+1;
            l[i] = IntToLetters(i+1);
        }
        
        for(int j = 0; j < from_vertex.length; j++){
            from_vertex[j] = rand.nextInt(2500) + 1;
            to_vertex[j] = rand.nextInt(2500) + 1;
            
        }
        System.out.println("Creating Undirected Graph.....");
        UndirectedGraph g = new UndirectedGraph(n, l);
        g.addConnections(from_vertex, to_vertex);
        g.printUndirectedGraph();
        g.writeGraphToFile();
    }
    
    public static String IntToLetters(int value)
{
    String result = "";
    while (--value >= 0)
    {
        result = (char)('A' + value % 26 ) + result;
        value /= 26;
    }
    return result;
}
    
}
