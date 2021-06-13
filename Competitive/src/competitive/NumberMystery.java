package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberMystery {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            int n = Integer.parseInt(read.readLine());
            int a = 1, b = n;

            for (int i = 2; i <= Math.sqrt(n); i++) 
            {
                if (n % i == 0) 
                {
                    a = i;
                    b = n / i;
                    break;
                }
            }
            System.out.println(a + " " + b);
        } catch (Exception e) {
        }
    }
}
