import java.util.*;
import java.io.*;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            if(i >= 1 && a[i] * a[i-1] > 0) {
                cnt++;
            } else {
                cnt = 1;
            }

            ans = Math.max(cnt, ans);
        }
        System.out.println(ans);
    }
}