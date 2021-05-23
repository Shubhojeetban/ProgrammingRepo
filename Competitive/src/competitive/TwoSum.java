/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ar = new int[2];
        for(int i =0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ar[0]= map.get(target - nums[i]);
                ar[1]= i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ar;
    }
}
