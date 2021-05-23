/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class DFS {

    private void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsList) {
        dfsList.add(node);
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, dfsList);
            }
        }
    }

    public ArrayList<Integer> dfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfsList = new ArrayList<>();
        boolean[] vis = new boolean[V + 1];

        //This loop will get all the dfs of the disconnected components of the grapgh
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                dfs(i, vis, adj, dfsList);
            }
        }

        return dfsList;
    }
}
