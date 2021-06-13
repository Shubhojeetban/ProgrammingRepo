/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class RangeCovered {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        for(int i =0; i < ranges.length; i++){
            int start = ranges[i][0];
            int end = ranges[i][1];
            
            if(!((left >= start && left <= end) || (right >= start && right <= end)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            int t = Integer.parseInt(read.readLine());

            int i =0;
            int [][] ar = new int[t][2];
            while(t-- > 0){
            String[] s = read.readLine().split(" ");
            ar[i][0] = Integer.parseInt(s[0]);
            ar[i][1] = Integer.parseInt(s[1]);
            i++;
            }
            String[] r = read.readLine().split(" ");
            int left = Integer.parseInt(r[0]);
            int right = Integer.parseInt(r[1]);
            System.out.println(isCovered(ar, left, right));
        } 
        catch (Exception e) {
        }
    }
}
