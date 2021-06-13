/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class CommonElements {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i =0, j=0, k =0;
        
        while(i < n1 && j < n2 && k < n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(!list.contains(A[i])){
                    list.add(A[i]);
                }
                i++; j++; k++;
            }
             else if(A[i] < B[j] || A[i] < C[k])
                i++;
            else if(B[j] < A[i] || B[j] < C[k])
                j++;
            else if(C[k] < A[i] || C[k] < B[j])
                k++;
        }
        
        return list;
    }
}
