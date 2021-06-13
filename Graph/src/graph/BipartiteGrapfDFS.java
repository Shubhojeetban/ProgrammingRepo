/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class BipartiteGrapfDFS {
    private boolean bipartite(int V, ArrayList<ArrayList<Integer>>adj, int[] color, int node){
        if(color[node] == -1){
            color[node] = 1;
        }
        for(Integer it : adj.get(node)){
            if(color[it] == -1){
                color[it] = 1-color[node];
                if(bipartite(V, adj, color, it)== false) return false;
            }
            else if(color[it] == color[node]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V+1];
        Arrays.fill(color, -1);
        
        for(int i =0; i< V; i++){
            if(color[i] == -1){
                if(!bipartite(V, adj, color, i)){
                    return false;
                }
            }
        }
        return true;
    }
}
