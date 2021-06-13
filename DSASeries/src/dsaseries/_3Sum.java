/*
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
package dsaseries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ACER
 */
public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length <= 0)
            return list;
        
        Arrays.sort(nums);
        
        for(int i =0; i < nums.length-2; i++)
        {
            int a_pointer = i+1;
            int b_pointer = nums.length-1;
            
            while(a_pointer < b_pointer)
            {
                int current_sum = nums[i]+nums[a_pointer]+nums[b_pointer];
                
                if(current_sum == 0)
                {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[a_pointer]);
                    l.add(nums[b_pointer]);
                    if(!list.contains(l))
                    list.add(l);
                    a_pointer++;
                }
                else if(current_sum > 0)
                    b_pointer--;
                else
                    a_pointer++;
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] s = read.readLine().split(" ");
            int[] nums = new int[s.length];
            
            for(int i =0; i < s.length; i++)
                nums[i] = Integer.parseInt(s[i]);
            
            List<List<Integer>> list = threeSum(nums);
            for(List l: list)
            {
                System.out.println(l);
            }
        }
        catch(Exception e){}
    }
}
