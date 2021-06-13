
package competitive;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class FactorialsOfLargeNumbers {
    private static ArrayList<Integer> multiply(ArrayList<Integer> list, int n){
        long carry =0, mul; int in;
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.reverse(list);
        for(Integer it : list){
            mul = it *n + carry;
            in = (int)(mul %10);
            arr.add(in);
            
            carry = mul /10;
        }
        if(carry != 0){
            arr.add((int)carry%10);
            carry /= 10;
        }
        
        Collections.reverse(arr);
        return arr;
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i =2; i <= N; i++){
            list = multiply(list, i);
        }
        return list;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = factorial(897);
        for(Integer it : list){
            System.out.print(it);
        }
        System.out.println();
        System.out.println(list.size());
    }
}
