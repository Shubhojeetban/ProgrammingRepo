/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
class Example{
    int counter = 0;
    public void method1(){
        System.out.print(++counter);
        while(counter < 3){
            method1();
            method1();
        }
    }
}
public class TestClass {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        
        int k =1;
        for(int i =0; i < n; i++){
            if(i%2 == 0){
                for(int j =0; j <= i; j++){
                    if(j < i){
                        System.out.print(k+"$");
                    }
                    else{
                        System.out.print(k);
                    }
                    k++;
                }
            }
            else{
                for(int j = i+k; j >= k; j--){
                    if(j > k){
                    System.out.print(j+"$");
                    }
                    else{
                        System.out.print(j);
                    }
                }
                k += i+1;
            }
            System.out.println();
        }
    }
}
