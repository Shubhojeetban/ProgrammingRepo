/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class MaximumOfAllSubarraysOfSizeK {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int i =0, j =0, max = Integer.MIN_VALUE;
        while(j < n){
            max = Math.max(max, arr[j]);
            if(max == arr[j]){
                deque.clear();
                deque.add(max);
            }
            else{
                deque.add(max);
            }
            
            if(j-i+1 < k)
                j++;
            else{
                al.add(deque.peek());
                if(deque.contains(arr[i])){
                    deque.poll();
                    max = deque.peek();
                }
                i++;
                j++;
            }
        }
        return al;
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            int k = Integer.parseInt(read.readLine());
            String[] s1 = read.readLine().split(" ");
            int[] ar1 = new int[n];
            for(int i =0; i < n; i++)
                ar1[i] = Integer.parseInt(s1[i]);
            ArrayList<Integer> al =max_of_subarrays(ar1, n, k);
            al.forEach(i -> {
                System.out.print(i+" ");
            });
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
