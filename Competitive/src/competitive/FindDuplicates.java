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
public class FindDuplicates {
    private static int function(int[] ar, int n){
        for(int i =0; i < n; i++){
            int j = Math.abs(ar[i]);
            if(ar[j] >= 0)
                ar[j] = -ar[j];
            else
                return j;
        }
        return -1;
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int[] ar = new int[n];
            for(int i =0; i < n; i++)
                ar[i] = Integer.parseInt(s[i]);
            int result = function(ar, n);
            System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
