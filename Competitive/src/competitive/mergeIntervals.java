/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ACER
 */
public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<Integer[]> al = new ArrayList<>();
        Integer prevStart, prevEnd, currStart, currEnd;
        if(intervals.length <= 1)
            return intervals;
        //To Sort the 2D array
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
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
}
