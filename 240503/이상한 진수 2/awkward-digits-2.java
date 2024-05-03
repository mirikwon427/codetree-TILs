import java.util.*;
import java.io.*;

public class Main{
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();

        int ans = INT_MIN;
        for(int i = 0; i < binary.length();i++) {
            binary = binary.substring(0,i) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
            int num = 0;
            for(int j = 0 ; j < binary.length();j++){
                num = num * 2 + (binary.charAt(j) - '0');
            }
            binary = binary.substring(0,1) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
            ans = Math.max(ans,num);
        }
        System.out.println(ans);
    }
}