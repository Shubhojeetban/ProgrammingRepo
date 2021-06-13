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
import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class Sample1 {
    public static void main(String[] args)throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        System.out.println("Enter the values to insert..");
        String[] s = read.readLine().split(" ");
        int i = 0;
        // Adding the values in list and map
        for(String s1: s){
            list.add(Integer.parseInt(s1));
            map.put(Integer.parseInt(s1), i);
            i++;
        }
        i =0;
        
        //Viewing any random number from list in O(1) time
        int index = ((int) (Math.random()*100) ) % list.size();
        System.out.println(list.get(index));
        
        //Performing the delete operation
        System.out.println("Enter a number from the list to delete");
        int num = Integer.parseInt(read.readLine());
        if(map.containsKey(num)){
            
        }
    }
}
