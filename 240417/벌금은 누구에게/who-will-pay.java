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
        int[] penaltyNum = new int[n + 1];
        int ans = -1;
        for(int j = 1; j <= m; j++) {
            int target = arr[j];
            penaltyNum[target]++;
            if(target >= 0 && penaltyNum[target] >= k) {
                ans = target;
                break;
            }
        }
        System.out.print(ans);
    }
}