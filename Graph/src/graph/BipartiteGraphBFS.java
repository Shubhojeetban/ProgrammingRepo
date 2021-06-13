/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class BipartiteGraphBFS {
    private boolean Bipartite(int V, ArrayList<ArrayList<Integer>> adj, int[] color, int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        while(!q.isEmpty()){
            Integer i = q.poll();
            for(Integer it : adj.get(i)){
                if(color[it] != -1){
                    q.add(it);
                    color[it] = 1- color[i];
                }
                else if(color[it] == color[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[V+1];
        Arrays.fill(color, -1);
        for(int i =0; i < V; i++){
            if(color[i] == -1){
                if(!Bipartite(V, adj, color, i)){
                    return false;
                }
            }
        }
        return true;
    }
}
