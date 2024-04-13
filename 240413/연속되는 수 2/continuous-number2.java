import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                cnt = 0;
            } else if (a[i] == a[i-1]){
                cnt++;
            }else {
                cnt = 0;
            }
            b[i] = cnt;
        }
        for(int i = 0; i < n; i++) {
            if(max < b[i]) {
                max = b[i];
            }
        }
        if( n == 1 ) {
            System.out.print(n);
        } else {

            System.out.print(max+1);
        }
    }
}