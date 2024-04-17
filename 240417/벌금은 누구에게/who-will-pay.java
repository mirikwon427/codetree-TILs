import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[m + 1];
        for(int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] ans = new int[n + 1];
        int cnt = 0;
        for(int j = 1; j <= m; j++) {
            for(int i = 0; i < n; i++) {
                if(arr[j] == i) {
                    ans[i]++;
                }
            }
        }
        int num = -1;
        for(int i = 1; i <= n; i++){
            if(ans[i] == k) {
                for(int j = 0; j < ans[i]; i++) {
                    num++;
                }
                break;
            }
        }
        System.out.print(num);
        
    }
}