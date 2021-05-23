
package competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Competitive {


    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        try{
            String s = read.readLine();
            String n="";
            for(Character c:s.toCharArray()){
                if((int)c < 97){
                    n=n+(char)(((int)c)+32);
                }
                else{
                    n=n+(char)(((int)c)-32);
                }
            }
            out.print(n);
            out.flush();
        }
        catch(Exception e){}
    }
    
}
