/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class MergingSOrtedArray {
    /*
    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code her
        int temp, ind, index;
        for(int i =0; i < n; i++){
            if(arr1[i] > arr2[0]){
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                
                //Insertion sort
                index = 0;
                ind = arr2[0];
                while(index < m-1){
                    if(arr2[index] > arr2[index+1]){
                    temp = arr2[index];
                    arr2[index] = arr2[index+1];
                    arr2[index+1] = temp;
                    index++;
                    }
                    else
                    break;
                }
                arr2[index] = ind;
            }
        }
    }
    */
    public static void merge(int arr1[], int arr2[], int n, int m) {
        //Using gap technique
        
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            String[] s1 = read.readLine().split(" ");
            int[] ar1 = new int[n];
            for(int i =0; i < n; i++)
                ar1[i] = Integer.parseInt(s1[i]);
            int m = Integer.parseInt(read.readLine());
            String[] s2 = read.readLine().split(" ");
            int[] ar2 = new int[m];
            for(int i =0; i < m; i++)
                ar2[i] = Integer.parseInt(s2[i]);
            merge(ar1, ar2, n, m);
            //Printing them
            for(int i =0; i < n; i++)
                System.out.print(ar1[i]+" ");
            for(int i =0; i <m; i++)
                System.out.print(ar2[i]+" ");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
