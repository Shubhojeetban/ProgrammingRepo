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
public class Array {
    private static int max(int n){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int rem =0;
        while(n != 0){
            rem = n% 10;
            q.add(rem);
            n /= 10;
        }
        return q.peek();
    }
    private static int compmax(int n1, int n2, int n3){
        return max(n1) + max(n2) + max(n3);
    }
    private static int max2(int n){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int rem =0;
        while(n != 0){
            rem = n% 10;
            q.add(rem);
            n /= 10;
        }
        q.poll();
        return q.poll();
    }
    private static int compmax2(int n1, int n2, int n3){
        return max2(n1)+ max2(n2)+ max2(n3);
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        try{
            String[] s = read.readLine().split(" ");
            int n1 = Integer.parseInt(s[0]);
            int n2 = Integer.parseInt(s[1]);
            int n3 = Integer.parseInt(s[2]);
            
            int max1 = compmax(n1,n2,n3);
            int max2 = compmax2(n1,n2,n3);
            
            out.println(max1-max2);
            out.flush();
            
        }
        catch(Exception e){}
    }
}
