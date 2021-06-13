package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class BitwiseTuples {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String[] s = read.readLine().split(" ");
                long n = Integer.parseInt(s[0]);
                long m = Integer.parseInt(s[1]);

                long count = 0;
                count = (long)(Math.pow(Math.pow(2, n)-1, m) % (int)(Math.pow(10, 9)+7));
                System.out.println(count);
            }
        } catch (Exception e) {
        }
    }
}
