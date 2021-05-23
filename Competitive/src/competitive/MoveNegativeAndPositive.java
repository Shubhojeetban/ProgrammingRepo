
package competitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ACER
 */
public class MoveNegativeAndPositive {
    private static void arrangeTheArray(int[] ar){
        int i = 0, j = ar.length-1, temp;
        while(i < j){
            if(ar[i] < 0)
                i++;
            if(ar[j] > 0)
                j--;
            if(ar[i] > 0 && ar[j] < 0){
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String[] s= read.readLine().split(" ");
            int i = 0;
            int[] ar = new int[n];
            for(String s1 : s){
                ar[i++] = Integer.parseInt(s1);
            }
            
            //Real Code
            arrangeTheArray(ar);
            for(int a =0; a < s.length; a++)
                System.out.print(ar[a]+" ");
        }
    }
}
