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
public class CycleDetectionBFS {
   class Pair{
        Integer first;
        Integer prev;
        Pair(int first, int prev){
            this.first = first;
            this.prev = prev;
        }
    }
    
    private boolean isCyclic(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, -1));
        vis[i] = true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int prev = q.peek().prev;
            q.remove();
            for(Integer it : adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(new Pair(it, node));
                }
                else if(it != prev){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);
        
        for(int i =0; i < V; i++){
            if(vis[i] == false){
                if(isCyclic(i, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }
}
