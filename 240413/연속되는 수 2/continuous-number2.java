import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0 || a[i] == a[i-1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if(max < cnt) {
                max = cnt;
            }
        }
        System.out.print(max);
    }
}