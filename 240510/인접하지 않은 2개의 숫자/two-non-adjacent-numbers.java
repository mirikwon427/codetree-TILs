import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int n;
    public static int[] arr = new int[MAX_N];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = INT_MIN;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i + 2; j < n; j++ ) {
                sum = arr[i] + arr[j];
                ans = Math.max(ans, sum);
            }
        }
        System.out.print(ans);
    }
}