/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class KeysAndRooms {
    private void bfsTraversal(List<List<Integer>> rooms, int[] vis)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = 0;
        
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            for(Integer it : rooms.get(node))
            {
                q.add(it);
                vis[it] = 0;
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        
        bfsTraversal(rooms, vis);
        
        for(Integer it : vis)
            if(it == -1)
                return false;
        return true;
    }
}
