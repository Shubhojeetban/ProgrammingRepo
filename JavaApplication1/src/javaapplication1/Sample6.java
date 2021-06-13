package javaapplication1;

/**
 *
 * @author ACER
 */
public class Sample6 {

    public static int findSmallestDriver(String s, String t) {
        int count = 0;
        if (s.length() % t.length() != 0) {
            return -1;
        }

        for (int i = 0; i < s.length(); i += t.length()) {
            String s1 = s.substring(i, i + t.length());
            if (!s1.contains(t)) {
                return -1;
            }
        }

        int len = t.length();
        count = len;
        
        //Code incomplete
        return count;
    }

    public static void main(String[] args) {
        int c = findSmallestDriver("abcabcabcabcabcabc", "abcabcabc");
        System.out.println(c);
    }
}
