import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_A = 100;
    public static char[] arr = new char[MAX_A];
    public static String a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        int cnt = 0;
        for(int i = 0; i < a.length();i++) {
            if(a.charAt(i) == ')'){
                continue;
            }
            if(a.charAt(i) == '(' && a.charAt(i+1) == '(') {
                for(int j = i+2; j < a.length() - 1; j++) {
                    if(a.charAt(j) == ')' && a.charAt(j+1) == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}