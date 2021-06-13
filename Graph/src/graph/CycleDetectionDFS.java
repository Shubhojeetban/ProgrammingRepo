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
public class CycleDetectionDFS {
    private boolean Cycle(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node, boolean[] dfs){
        if(!vis[node]){
            vis[node] = true;
            dfs[node] = true;
        }
        for(Integer it : adj.get(node)){
            if(!vis[it]){
                vis[it] = true;
                dfs[it] = true;
                if(Cycle(V, adj, vis, it, dfs)) return true;
                dfs[it] = false;
            }
            else if(dfs[it]) return true;
        }
        dfs[node] = false;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);
        
        boolean[] dfs = new boolean[V+1];
        Arrays.fill(dfs, false);
        
        for(int i =0; i < V; i++){
            if(!vis[i]){
                if(Cycle(V, adj, vis, i, dfs)){
                    return true;
                }
            }
        }
        return false;
    }
}
