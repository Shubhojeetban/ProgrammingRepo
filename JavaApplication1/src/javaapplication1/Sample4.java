/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class Sample4 {
    public int countOccurence(int needle, int haystack){
        int answer = 0;
        int rem;
        while(haystack != 0){
            rem = haystack %10;
            if(rem == needle){
                answer++;
            }
            haystack = haystack /10;
        }
        
        return answer;
    }
    public static void main(String[] args){
    }
}
