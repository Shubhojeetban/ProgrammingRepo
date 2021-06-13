/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Sample3 {
    private static int fun(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<= n; i++){
            list.add(i);
        }
        while(list.size() != 1){
            int l = (list.size() %2 == 0) ?list.size()-1 : list.size();
            for(int j = l ; j > 0; j -= 2){
                list.remove(j-1);
            }
        }
        return list.get(0);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        int result = fun(n);
        System.out.println(result);
    }
}
