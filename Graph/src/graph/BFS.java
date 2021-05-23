
package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    //This function is to traverse all the disconnected component of the graph starting form 0-V
    public ArrayList<Integer> bfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V + 1];
        //Loop to iterate every component
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                Queue<Integer> q = new LinkedList<Integer>();
                q.add(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    Integer node = q.poll();
                    vis[node] = true;
                    bfs.add(node);
                    for(Integer it : adj.get(node)){
                        q.add(it);
                        vis[it] = true;
                    }
                }
            }
        }
        return bfs;
    }
}
