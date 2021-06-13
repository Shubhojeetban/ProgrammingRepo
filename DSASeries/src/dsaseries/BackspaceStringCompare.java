/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:

Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".

Example 4:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

 */
package dsaseries;

/**
 *
 * @author ACER
 */
public class BackspaceStringCompare {
    //Own Solution
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i)=='#'){
                if(s1.length() >0)
                s1.deleteCharAt(s1.length()-1);
            }
            else
                s1.append(s.charAt(i));
        }
        
        for(int i =0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(t1.length() > 0)
                t1.deleteCharAt(t1.length()-1);
            }
            else
                t1.append(t.charAt(i));
        }
        System.out.println(s1+" "+t1);
        return s1.toString().equals(t1.toString());
    }
    //Solution By Nick White
    public boolean backspaceCompare1(String s, String t){
        int S_pointer = s.length()-1;
        int T_pointer = t.length()-1;
        
        int S_skips = 0;
        int T_skips = 0;
        
        while(S_pointer >=0 || T_pointer >= 0){
            while(S_pointer >= 0)
            {
                if(s.charAt(S_pointer) == '#'){
                    S_pointer -= 1;
                    S_skips += 1;
                }
                else if(S_skips > 0){
                    S_pointer -=1;
                    S_skips -= 1;
                }
                else
                    break;
            }
            
            while(T_pointer >= 0)
            {
                if(t.charAt(T_pointer) == '#')
                {
                    T_pointer -=1;
                    T_skips += 1;
                }
                else if(T_skips > 0)
                {
                    T_pointer -= 1;
                    T_skips -=1;
                }
                else
                    break;
            }
            if(S_pointer >= 0 && T_pointer >= 0 && s.charAt(S_pointer) != t.charAt(T_pointer))
                return false;
            
            if((S_pointer >= 0) != (T_pointer >= 0))
                return false;
            
            S_pointer -= 1;
            T_pointer -= 1;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(backspaceCompare("xywrrmp","xywrrmu#p"));
    }
}
