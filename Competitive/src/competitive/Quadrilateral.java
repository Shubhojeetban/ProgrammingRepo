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
public class Quadrilateral {
    public static void main(String args[]) throws IOException 
  {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(read.readLine());
      while(t-- > 0)
      {
          String[] s = read.readLine().split(" ");
          int[] ar = new int[s.length];
          
          for(int i =0; i < s.length; i++)
          {
            ar[i] = Integer.parseInt(s[i]);
          }
          
          int x1 = ar[0];
          int y1 = ar[1];
          
          int x2 = ar[2];
          int y2 = ar[3];
          
          int x3 = ar[4];
          int y3 = ar[5];
          
          int x4 = ar[6];
          int y4 = ar[7];
          
          int e1 = x1 - x3;
          int e2 = x2 - x4;
          
          int e3 = y1 - y4;
          int e4 = y3 - y2;
          
          if(e1 == e2 && e3 == e4){
            System.out.println("Yes");
          }
          else{
            System.out.println("No");
          }
          
      }
  }
}
