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
    private boolean isCyclic(int node, int prev, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(!vis[it]){
                isCyclic(it, node, vis, adj);
            }
            else if(it != prev){
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(isCyclic(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }
}
