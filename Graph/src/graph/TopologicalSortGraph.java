/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class TopologicalSortGraph {
    private static void dfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> st, int node ,boolean[] vis)
    {
        vis[node] = true;
        
        for(Integer it : adj.get(node)){
            if(!vis[it]){
                dfs(adj, st, it, vis);
            }
        }
        st.push(node);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);
        Stack<Integer> st = new Stack<>();
        
        for(int i =0; i < V; i++){
            if(!vis[i]){
                dfs(adj, st, i, vis);
            }
        }
        int[] ar = new int[st.size()];
        for(int i = 0; i < V; i++){
            ar[i] = st.pop();;
        }
         return ar;
    }
}
