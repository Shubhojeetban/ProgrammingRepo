/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
class Solution1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] smallest_left = new int[n];
        int[] largest_right = new int[n];
        smallest_left[0] = prices[0];
        largest_right[n-1] = prices[n-1];
        
        for(int i =1; i < n; i++){
            smallest_left[i] = (smallest_left[i-1] < prices[i]) ?smallest_left[i-1] :prices[i];
        }
        for(int i = n-2; i >=0; i--){
            largest_right[i] = (largest_right[i+1] > prices[i]) ?largest_right[i+1] :prices[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i =0; i <n; i++){
            if(largest_right[i] - smallest_left[i] > max)
                max = largest_right[i] - smallest_left[i] ;
        }
        return max;
    }
}
public class BuyAndSellStock {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            Solution1 sol = new Solution1();
            int n = Integer.parseInt(read.readLine());
            String[] s1 = read.readLine().split(" ");
            int[] ar1 = new int[n];
            for(int i =0; i < n; i++)
                ar1[i] = Integer.parseInt(s1[i]);
            int result = sol.maxProfit(ar1);
            System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
