/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class LAPIN {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        try{
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0){
                String s = read.readLine();
                String s1, s2;
                boolean flag = true;
                if(s.length() % 2 == 0)
                {
                    s1 = s.substring(0, s.length()/2);
                    s2 = s.substring(s.length()/2, s.length());
                }
                else{
                    s1 = s.substring(0, s.length()/2);
                    s2 = s.substring(s.length()/2 +1, s.length());
                }
                ArrayList<Character> list = new ArrayList<>();
                for(Character ch : s1.toCharArray()){
                    list.add(ch);
                }
                for(Character ch : s2.toCharArray()){
                    if(!(list.contains(ch)))
                    {
                        flag = false;
                        break;
                    }
                    list.remove(ch);
                }
                if(flag && list.isEmpty())
                    out.println("YES");
                else
                    out.println("NO");
            }
            out.flush();
            out.close();
            read.close();
        }
        catch(Exception e){}
        
    }
}
