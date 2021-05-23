package competitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ACER
 */
public class QuickSelect {

    public static int quickSelect(int[] ar, int low, int high, int k) {
        int index = partition(ar, low, high);
        if (index + 1 == k) {
            return ar[k];
        } else if (index < k) {
            return quickSelect(ar, k + 1, high, k);
        } else {
            return quickSelect(ar, low, k - 1, k);
        }
    }

    public static int partition(int[] ar, int low, int high) {
        int pivot = ar[high];
        int i = low, temp;

        for (int j = low; j < high - 1; j++) {
            if (ar[i] < pivot) {
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
            }
        }
        temp = ar[i + 1];
        ar[i + 1] = pivot;
        ar[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String[] s = read.readLine().split(" ");
            int k = Integer.parseInt(read.readLine());
            int[] ar = new int[n];
            int i = 0;
            for (String s1 : s) {
                ar[i++] = Integer.parseInt(s1);
            }

            int result = quickSelect(ar, 0, n - 1, k);
            out.println(result);
            out.flush();
        }

    }
}
