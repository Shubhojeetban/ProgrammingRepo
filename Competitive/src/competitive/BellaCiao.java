/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ACER
 */
public class BellaCiao {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        try {
            int t = Integer.parseInt(read.readLine());

            while (t-- > 0) {
                String[] s = read.readLine().split(" ");
                long D = Long.parseLong(s[0]);
                long d = Long.parseLong(s[1]);
                long P = Long.parseLong(s[2]);
                long Q = Long.parseLong(s[3]);
                long result=0;
                
                long n = D/d;
                result = (n*P + Q*(((n-1)*n)/2))*d;
                
                if(D%d != 0)
                    result += (D%d)*(P+(n*Q));
                
                out.println(result);
            }
            out.flush();
            read.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
