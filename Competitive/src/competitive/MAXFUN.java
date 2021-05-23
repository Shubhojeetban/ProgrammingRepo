/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ACER
 */
public class MAXFUN {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        try{
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0){
                int n = Integer.parseInt(read.readLine());
                String[] s = read.readLine().split(" ");
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
                for(int i = 0;i < n; i++){
                    int temp = Integer.parseInt(s[i]);
                    pq.add(temp);
                    p.add(temp);
                }
                int ax = p.poll();
                int ay = p.poll();
                int az = pq.poll();
                
                int result = Math.abs(ax - az) + Math.abs(ay - az) + Math.abs(ax - ay);
                out.println(result);
                out.flush();
            }
        }
        catch(Exception e){}
    }
}
