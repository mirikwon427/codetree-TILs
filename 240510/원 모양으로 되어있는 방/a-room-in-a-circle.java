import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = INT_MAX;
        for(int i = 0; i < n; i++) {
            int sumDist = 0;
            for(int j = 0; j < n; j++) {
                int dist = ( j + n - i ) % n;
                sumDist += arr[j] * dist;
            }
            ans = Math.min(sumDist, ans);
        }
        System.out.print(ans);
    }
}