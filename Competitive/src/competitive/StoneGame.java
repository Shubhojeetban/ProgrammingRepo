/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class StoneGame {
    //Solution needs dynamic programing
    public static int stoneGameVII(int[] stones) {
        int a_pointer = 0;
        int b_pointer = stones.length-1;
        
        int total_score = 0;
        for(Integer i : stones)
            total_score += i;
        
        int alice_score= 0, bob_score = 0;
        int i =0;
        
        while(a_pointer <= b_pointer)
        {
            if(i%2 == 0)
            {
                if(stones[a_pointer] < stones[b_pointer])
                {
                    total_score -= stones[a_pointer];
                    alice_score += total_score;
                    a_pointer++;
                }
                else{
                    total_score -= stones[b_pointer];
                    alice_score += total_score;
                    b_pointer--;
                }
            }
            else
            {
                if(stones[a_pointer] < stones[b_pointer])
                {
                    total_score -= stones[a_pointer];
                    bob_score += total_score;
                    a_pointer++;
                }
                else{
                    total_score -= stones[b_pointer];
                    bob_score += total_score;
                    b_pointer--;
                }
            }
            i++;
        }
        return alice_score - bob_score;
    }
    public static void main(String[] args)
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] s = read.readLine().split(" ");
            int[] arr = new int[s.length];
            for(int i =0; i < s.length; i++)
                arr[i] = Integer.parseInt(s[i]);
            int r = stoneGameVII(arr);
            System.out.println(r);
        }
        catch(Exception e ){}
    }
}
