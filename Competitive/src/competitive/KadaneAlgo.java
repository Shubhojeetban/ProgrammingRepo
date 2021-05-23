
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class KadaneAlgo {
    private static int maxSumOfSubArray(int[] a, int n){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0){
                int n = Integer.parseInt(read.readLine());
                String[] s = read.readLine().split(" ");
                int[] ar = new int[n];
                for(int i =0;i < n; i++){
                    ar[i] = Integer.parseInt(s[i]);
                }
                int result = maxSumOfSubArray(ar, n);
                System.out.println(result);
            }
        }
        catch(Exception e){}
    }
}
