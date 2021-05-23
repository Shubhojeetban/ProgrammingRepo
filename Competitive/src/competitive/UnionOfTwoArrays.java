/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ACER
 */
public class UnionOfTwoArrays {

    public static int doUnion(int a[], int n, int b[], int m) {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : a) {
            set.add(i);
        }
        for (Integer i : b) {
            set.add(i);
        }
        return set.size();
    }

    public static int doUnion1(int a[], int n, int b[], int m) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < n; i++)
        map.put(a[i], i);
        for(int i =0; i < m; i++)
        map.put(b[i], i);
        
        return map.size();
    }

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int n = Integer.parseInt(read.readLine());
                String[] s = read.readLine().split(" ");
                int i = 0;
                int[] ar = new int[n];
                for (String s1 : s) {
                    ar[i++] = Integer.parseInt(s1);
                }
                
            }
        } catch (Exception e) {
        }
    }
}
