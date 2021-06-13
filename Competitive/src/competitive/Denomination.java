
package competitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class Denomination {
    public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(read.readLine());
      int[] ar = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
      while(t-- > 0){
        int n = Integer.parseInt(read.readLine());
        int count=0, index = 0;
        while(n!= 0){
          int i =index;
          while(true){
            if(ar[i] <= n){
              n = n- ar[i];
              count++;
              index = i;
              break;
            }
            i++;
          }
        }
        System.out.println(count);
      }
    }
    
}
