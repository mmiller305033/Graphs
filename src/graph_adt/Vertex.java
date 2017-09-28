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
public class Vertex {
    private int number;
    private String label;
    ArrayList<Vertex> connections = new ArrayList<>();
    
    public Vertex(int n, String l){
        number = n;
        label = l;
    }  
    
    public void setNumber(int n){
        number = n;
    }
    public int getNumber(){
        return number;
    }
    public void setLabel(String l){
        label = l;
    }
    public String getLabel(){
        return label;
    }
    public ArrayList<Vertex> getConnections(){
        return connections;
    }
    public void printConnections(){
        System.out.print("Vertex " + this.getLabel() + ": ");
        if(!connections.isEmpty()){
            for(int i = 0; i < connections.size() - 1; i++){
            System.out.print(connections.get(i).getLabel() + ", ");
            }
        System.out.print(connections.get(connections.size() - 1).getLabel() + "\n");
        }
        else{
            System.out.println();
        }
        
    }
    public void addConnection(Vertex v){
        //System.out.println("Connection Created Between " + v.getLabel() + "and " + this.getLabel());
        if(v != this){
            if(!connections.contains(v)){
               connections.add(v);
            }
            if(!v.getConnections().contains(this)){
               v.addConnection(this);
            }         
        }

        
    }
}
