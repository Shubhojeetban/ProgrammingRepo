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
public class HDIVISR {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            int re = 0;
            for(int i = 10; i >= 0; i--){
                if(n % i == 0){
                    re = i;
                    break;
                }
            }
            System.out.println(re);
        }
        catch(Exception e){}
    }
}
