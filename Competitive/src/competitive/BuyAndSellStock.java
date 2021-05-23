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
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
