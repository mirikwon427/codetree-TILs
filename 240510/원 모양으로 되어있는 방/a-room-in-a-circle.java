import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int[] people = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = Integer.parseInt(st.nextToken());
        }

        int result = INT_MAX;
        for(int i = 0; i < n; i++) {
            int prevIdx = i;
            int ans = 0;
            for(int j = 0; j < n; j++) {
                if(i == (n-j)) {
                    int idx = j;
                    for(int x = 0; x < n-j; x++) {
                        ans += people[x] * idx;
                        idx++;
                    }
                    break;
                }
                ans += people[prevIdx] * j;
                prevIdx++;
            }
            result = Math.min(ans, result);
        }
        System.out.print(result);
    }
}