package competitive;


import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int curr_count =0, max_count = 1;
        for(int i =0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                curr_count++;
                max_count = Math.max(curr_count, max_count);
                set.add(s.charAt(i));
            }
            else{
                curr_count =0;
                set.clear();
            }
        }
        return max_count;
    }
}
