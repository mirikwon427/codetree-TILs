import java.util.*;
import java.io.*;

public class Main{
    public static final int MAX_N = 100;
    public static final int INT_MIN = Integer.MAX_VALUE;

    public static int n;
    public static int[] arr = new int[MAX_N];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int minSum = INT_MIN;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            int sumDir = 0;
            for(int j = 0; j <= n; j++) {
                int multi = Math.abs(i - j);
                sumDir += arr[j] * multi;
            }
            minSum = Math.min(minSum, sumDir);
        }
        System.out.println(minSum);
    }
}