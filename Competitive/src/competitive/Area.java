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
public class Area {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            String [] b = read.readLine().split(" ");
            String [] h = read.readLine().split(" ");
            
            int b1= Integer.parseInt(b[0]);
            int h1= Integer.parseInt(b[1]);
            int b2= Integer.parseInt(h[0]);
            int h2= Integer.parseInt(h[1]);
            
            int a1 = (b1*h1)/2;
            int a2 = (b2*h2)/2;
            
            int result = (a1 > a2)?a1 :a2;
            System.out.println(result+",000000");
        }
        catch(Exception e){}
    }
}
