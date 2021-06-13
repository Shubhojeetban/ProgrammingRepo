/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i =0; i < n; i++)
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        
        for(int i =0; i < n; i++){
            if(map.containsKey(k-arr[i])){
                count += map.get(k-arr[i]);
            }
            if(k - arr[i] == arr[i])
            count--;
        }
        return count/2;
    }
}
