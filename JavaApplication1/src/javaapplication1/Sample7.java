
package javaapplication1;

/**
 *
 * @author ACER
 */
public class Sample7 {
    private static int isValid(String s){
        if(s.length() < 4)
            return 0;
        if(s.charAt(0)>= 48 && s.charAt(0) <= 57)
            return 0;
        
        boolean isNum = false;
        boolean isCap = false;
        
        for(Character ch : s.toCharArray()){
            if(ch >= 48 && ch <= 57)
                isNum = true;
            else if(ch >= 65 && ch <= 90)
                isCap = true;
            else if(ch == ' ' || ch == '/')
                return 0;
        }
        
        if(isNum && isCap) return 1;
        return 0;
    }
    public static void main (String args[]) {
        System.out.println(isValid("aA1/67"));
    }
}
