/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidingwindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class maxSumSubArrayOfSizeK {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int k = Integer.parseInt(read.readLine());
            
            int[] ar = new int[n];
            for(int i =0;i < n; i++){
                ar[i] = Integer.parseInt(s[i]);
            }
            int i =0, j = 0, sum =0, max_sum = Integer.MIN_VALUE;
            while(j < n){
                sum += ar[j];
                if(j-i+1 < k){
                    j++;
                }
                else{
                    max_sum = Math.max(sum, max_sum);
                    sum -= ar[i];
                    i++;
                    j++;
                }
            }
            System.out.println(max_sum);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
