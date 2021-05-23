/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ACER
 */
public class ZCO14003 {
    public static void main(String[] args){
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         try{
             int t = Integer.parseInt(read.readLine());
             PriorityQueue<Integer> q = new PriorityQueue<>();
             while(t-- > 0){
                 q.add(Integer.parseInt(read.readLine()));
             }
             PriorityQueue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());
             int size = q.size();
             while(!q.isEmpty()){
                 result.add(q.poll() * size);
                 size--;
             }
             int res = result.peek();
             System.out.println(res);
         }
         catch(Exception e){}
    }
}
