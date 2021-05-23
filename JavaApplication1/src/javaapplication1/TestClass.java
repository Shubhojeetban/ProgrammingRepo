/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class TestClass {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] s = read.readLine().split(" ");
            System.out.println(s.length);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
