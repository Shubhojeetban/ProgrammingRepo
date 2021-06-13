/*
 Given an array nums of n integers and an integer target, 
find three integers in nums such that the sum is closest to target. 
Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 */
package dsaseries;

import java.util.Arrays;

public class _3SumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i =0; i < nums.length-2; i++)
        {
            int a_pointer = i+1;
            int b_pointer = nums.length-1;
            
            while(a_pointer < b_pointer)
            {
                int current_sum = nums[i]+nums[a_pointer]+nums[b_pointer];
                if(current_sum > target)
                    b_pointer--;
                else
                    a_pointer++;
                
                if(Math.abs(current_sum - target) < Math.abs(result - target))
                    result = current_sum;
            }
        }
        return result;
    }
}
