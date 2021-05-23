package slidingwindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class FirstNegativeIntInEveryWindowOfKSize {

    private static void function(int[] ar, int n, int k) {
        int i =0, j =0;
        ArrayList<Integer> list = new ArrayList<>();
        while(j < n){
            if(ar[j] < 0)
                list.add(ar[j]);
            if(j-i+1 < k)
                j++;
            else{
                if(!list.isEmpty()){
                    System.out.print(list.get(0));
                }
                else{
                    System.out.print(0);
                }
                if(list.contains(ar[i])){
                    //To remove the object from ArrayList
                    list.remove(new Integer(ar[i]));
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int k = Integer.parseInt(read.readLine());

            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }

            function(ar, n, k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
