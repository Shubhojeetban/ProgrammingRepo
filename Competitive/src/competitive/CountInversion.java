package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    static private long result=0;
    static long sortWithCount(long[] arr, long l, long mid, long h){
        int i =0, j =0, k =(int)l;
        int ll = (int)mid+1-(int)l, hl = (int)h-(int)mid; 
        
        long[] left = new long[ll];
        long[] right = new long[hl];
        
        for(int a = (int)l, b =0; b < ll; a++, b++){
            left[b] = arr[a];
        }
        for(int a = (int)mid+1, b = 0; b < hl; a++, b++){
            right[b] = arr[a];
        }
        
        while(i < ll && j < hl){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;k++;
            }
            else{
                arr[k] = right[j];
                j++; k++;
                result = result + (mid+1) - (l+i);
            }
        }
        while(i < ll){
            arr[k] = left[i];
            i++; k++;
        }
        while(j < hl){
            arr[k] = right[j];
            j++; k++;
        }
        return result;
    }
    static long partition(long[] arr, long l, long h){
        if(l < h){
            long mid = l+ (h-l)/2;
            
            partition(arr, l, mid);
            partition(arr, mid+1, h);
            
            sortWithCount(arr, l, mid, h);
        }
        return result;
    }
    static long inversionCount(long arr[], long N)
    {
        partition(arr, 0, N-1);
        return result;
    }
}
public class CountInversion {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            Solution sol = new Solution();
            long n = Long.parseLong(read.readLine());
            String[] s1 = read.readLine().split(" ");
            long[] ar1 = new long[(int)n];
            for(int i =0; i < n; i++)
                ar1[i] = Long.parseLong(s1[i]);
            long result = sol.inversionCount(ar1, n);
            System.out.println(result);
            for(int i =0; i < n; i++)
                System.out.print(ar1[i]+" ");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
