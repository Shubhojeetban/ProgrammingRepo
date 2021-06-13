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
public class Sample9 {
    private static boolean isMagical(int n)
    {
        int prev=0, rem; boolean flag = true;
        while(n != 0)
        {
            if(flag)
            {
                prev = n%10;
                n = n/10;
            }
            else
            {
                rem = n%10;
                if(Math.abs(prev - rem) !=1)
                    return false;
                n= n/10;
                prev = rem;
            }
            flag = false;
        }
        return true;
    }
    private static int sumOfNobitaNumber(int n, int m)
    {
        int sum = 0;
        for(int i =n; i <= m; i++)
        {
            if(isMagical(i))
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] s = read.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            
            int sum = sumOfNobitaNumber(n,m);
            System.out.println(sum);
        }
        catch(Exception e ){}
    }
}
