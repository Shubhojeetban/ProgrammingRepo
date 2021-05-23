
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        boolean flag = false;
        int index = 0, temp;
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i-1]<nums[i]){
                index = i-1;
                flag = true;
                break;
            }
        }
        if(!flag){
            Arrays.sort(nums);
        }
        else{
            System.out.println(index);
            int indi = 0;
            for(int i = nums.length-1; i > index; i--){
                if(nums[i] > nums[index]){
                    indi = i;
                    break;
                }
            }
            temp = nums[index];
            nums[index] = nums[indi];
            nums[indi] = temp;
            
            Arrays.sort(nums, index+1, nums.length);
        }
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(read.readLine());
            String[] s1 = read.readLine().split(" ");
            int[] ar1 = new int[n];
            for(int i =0; i < n; i++)
                ar1[i] = Integer.parseInt(s1[i]);
            nextPermutation(ar1);
            for(int i =0; i < n; i++)
                System.out.print(ar1[i]+" ");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
