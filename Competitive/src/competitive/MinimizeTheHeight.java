package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimizeTheHeight {

    private static int getMinDiff(int[] ar, int n, int k) {
        int max = Integer.MIN_VALUE, minlo, maxlo;
        int ma = Integer.MIN_VALUE, mi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] - k > 0) {
                    minlo = ar[i] - k;
                    maxlo = ar[j] + k;
                    if (minlo <= mi && ma <= maxlo) {
                        max = maxlo - minlo;
                        mi = minlo;
                        ma = maxlo;
                    }
                    System.out.println("for arr : " + ar[i] + " " + ar[j] + " high lo " + minlo + " " + maxlo + " max = " + max);
                }
                if (ar[j] - k > 0) {
                    minlo = ar[j] - k;
                    maxlo = ar[i] + k;
                    if (minlo <= mi && ma <= maxlo) {
                        max =  maxlo - minlo;
                        mi = minlo;
                        ma = maxlo;
                    }
                    System.out.println("for arr : " + ar[j] + " " + ar[i] + " high lo " + minlo + " " + maxlo + " max = " + max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            int k = Integer.parseInt(read.readLine());
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            }
            int result = getMinDiff(ar, n, k);
            System.out.println(result);
        } catch (Exception e) {
        }
    }
}
