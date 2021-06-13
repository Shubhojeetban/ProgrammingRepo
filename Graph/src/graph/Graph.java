/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Graph {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BipartiteGraphBFS bp = new BipartiteGraphBFS();
        String[] s = read.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i =0; i < k; i++){
            String[] s1 = read.readLine().split(" ");
            int n1 = Integer.parseInt(s1[0]);
            int n2 = Integer.parseInt(s1[1]);
            
            adj.get(n1).add(n2);
            adj.get(n2).add(n1);
        }
        if(bp.isBipartite(n, adj)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }  
}
