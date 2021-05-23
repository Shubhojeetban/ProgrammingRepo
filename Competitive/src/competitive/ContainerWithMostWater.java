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
public class ContainerWithMostWater {

    public static int bruteforceApproach(int[] ar) {
        int n = ar.length;
        int max_water = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int b = j - i;
                int h = Math.min(ar[i], ar[j]);
                max_water = Math.max(max_water, b * h);
            }
        }
        return max_water;
    }
    public static int OptimizedtoOn(int [] ar){
        int n = ar.length;
        int i = 0, j = n-1;
        int max_water = 0;
        while(i < j){
            int b = j-i;
            int h = Math.min(ar[i], ar[j]);
            max_water = Math.max(max_water, b*h);
            if(ar[i] < ar[j])
                i++;
            else
                j--;
        }
        return max_water;
    }

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }
            //int max_water = bruteforceApproach(ar);
            int max_water = OptimizedtoOn(ar);
            System.out.println(max_water);
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            
        } 
        catch (Exception e) {
            System.out.print(e);
        }
    }
}
