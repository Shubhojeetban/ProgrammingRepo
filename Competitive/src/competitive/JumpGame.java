/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

/**
 *
 * @author ACER
 */
public class JumpGame {
    public int maxResult(int[] nums, int k) {
        int n = nums.length, curr_max, sum=0;
        for(int i =0; i < n; i++)
        {
            curr_max = nums[i];
            for(int j =i+1; j <= i+k && j < n;  j++)
            {
                if(nums[j] > curr_max)
                    curr_max = nums[j];
            }
            
        }
        return sum;
    }
}
