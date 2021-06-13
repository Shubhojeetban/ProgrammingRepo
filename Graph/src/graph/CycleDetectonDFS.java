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
public class CycleDetectonDFS {
     private boolean Cycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node, int parent)
    {
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(!vis[it]){
                if(Cycle(adj, vis, it, node)== true) return true;
            }
            else if(it != parent){
                return true;
            }
        }
        return false;
    }
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] vis = new boolean[V+1];
        for(int i =0; i < V; i++){
            if(!vis[i]){
                if(Cycle(adj, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
}
