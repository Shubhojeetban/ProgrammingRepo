/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author ACER
 */
public class Sample5 {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            Deque<Integer> q = new LinkedList<>();
            for(int i =0; i < n; i++){
                q.add(Integer.parseInt(s[i]));
            }
            
        }
        catch(Exception e){
            
        }
    }
}
