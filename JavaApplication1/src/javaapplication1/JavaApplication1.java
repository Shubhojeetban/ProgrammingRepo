/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

public class JavaApplication1 {

    public int[][] merge(int[][] intervals) {
        ArrayList<Integer[]> al = new ArrayList<>();
        Integer prevStart, prevEnd, currStart, currEnd;
        if(intervals.length <= 1)
            return intervals;
        
        prevStart = intervals[0][0];
        prevEnd = intervals[0][1];
        int i =0;
        for (i = 1; i < intervals.length; i++) {
            currStart = intervals[i][0];
            currEnd = intervals[i][1];
            
            if(currStart <= prevEnd){
                if(prevEnd <= currEnd){
                    prevEnd = currEnd;
                }
                if(currStart <= prevStart){
                    prevStart = currStart;
                }
            }
            else{
                Integer[] ar = new Integer[2];
                ar[0] = prevStart;
                ar[1] = prevEnd;
                al.add(ar);
                prevStart = currStart;
                prevEnd = currEnd;
            }
        }
        //Hence Last element is not reachable
        Integer[] ar = new Integer[2];
        ar[0] = prevStart;
        ar[1] = prevEnd;
        al.add(ar);
        
        int[][] result = new int[al.size()][2];
        int j =0;
        for(Integer[] s : al){
            result[j][0] = s[0];
            result[j][1] = s[1];
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr2 = new int[]{11, 5, 6, 8, 9};
        int index = 0, temp;
        int ind = arr2[0];
        System.out.println(arr2[index] + " " + arr2[index + 1]);
        while (index < arr2.length - 1) {
            if (arr2[index] > arr2[index + 1]) {
                temp = arr2[index];
                arr2[index] = arr2[index + 1];
                arr2[index + 1] = temp;
                index++;
            } else {
                break;
            }
        }
        arr2[index] = ind;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
