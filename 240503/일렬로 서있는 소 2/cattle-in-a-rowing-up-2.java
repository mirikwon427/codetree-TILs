import java.util.*;
import java.io.*;

public class Main{
    public static final int MAX_A = 100;
    public static int n;
    public static int[] a = new int[MAX_A];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] <= a[j]){
                    for(int k = j + 1; k < n; k++) {
                        if(a[j] <= a[k]){
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}