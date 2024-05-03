import java.util.*;
import java.io.*;

public class Main {
    public static String a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = br.readLine();

        int cnt = 0;

        for(int i = 0; i < a.length();i++) {
            if(a.charAt(i) == '('){
                for(int j =i+1; j < a.length(); j++) {
                    if(a.charAt(j) == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}