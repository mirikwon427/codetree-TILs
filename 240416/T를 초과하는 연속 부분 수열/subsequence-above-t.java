import java.util.*;
import java.io.*;

public class Main {
    public static int n, t;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0, ans= 0;
        for(int i = 0; i < n; i++) {
            if(i >= 1 && a[i] > t && a[i-1] > t){
                cnt++;
            } else {
                cnt = 1;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}