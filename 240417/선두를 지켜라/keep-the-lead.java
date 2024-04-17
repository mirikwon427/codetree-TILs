import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 1000000;

    public static int n, m, v, t;
    public static int[] distanceA = new int[MAX_N+1];
    public static int[] distanceB = new int[MAX_N+1];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int target1 = 0, target2 = 0;

        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            if(i < n){
                t += target1;
                for(int j = target1 + 1; j <= t; j++) {
                    distanceA[j] = distanceA[j-1] + v;
                    target1++;
                }
            } else {
                t += target2;
                for(int k = target2+1; k <= t; k++) {
                    distanceB[k] = distanceB[k-1] + v;
                    target2++;
                }
            }
        }
        int[] ans = new int[MAX_N];
        for(int i = 1; i < target1; i++) {
            if(distanceA[i] > distanceB[i]){
                ans[i] = 1;
            } else {
                ans[i] = 2;
            }
        }
        int cnt = 0;
        for(int i = 2; i < target1; i++) {
            if(ans[i] != ans[i-1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}