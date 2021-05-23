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
public class SOLBLTY {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0){
                String[] s = read.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                
                int result = (a + ((100 - x)*b) )*10;
                System.out.println(result);
            }
        }
        catch(Exception e){
            
        }
    }
}
