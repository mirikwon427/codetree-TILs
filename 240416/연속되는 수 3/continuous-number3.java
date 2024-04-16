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
        int ans = 0, plus = 0, minus = 0;
        for(int i = 0; i < n; i++) {
            if(i >= 1 && a[i] > 0 && a[i-1] > 0) {
                plus++;
                minus = 0;
            } else if(i >= 1 && a[i] < 0 && a[i-1] < 0){
                plus = 0;
                minus++;
            } else {
                if(minus < plus) {
                    ans = plus;
                }
                if(plus < minus) {
                    ans = minus;
                }
                if(i == 0){
                    if(a[i] >= 0) {
                        plus++;
                    } else {
                        minus++;
                    }
                } else if(a[i] >= 0) {
                    plus++;
                    minus = 1;
                } else {
                    minus++;
                }
            }
        }
        System.out.println(ans);
    }
}