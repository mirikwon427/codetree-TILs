import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 20;
    public static int n,m,t;
    public static String d;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arrN = new int[MAX_R + 1];
        int[] arrM = new int[MAX_R + 1];        
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            d = st.nextToken();
            t = Integer.parseInt(st.nextToken());
            if(i < n) {
                t += cnt1;
                if(d.equals("R")) {
                    for(int j = cnt1; j <= t; j++) {
                        arrN[j] = j;
                    }
                    cnt1 = j;
                } else {
                    for(int k = cnt1; k <= t; k++) {
                        arrN[k] = k-1;
                    }
                    cnt1 = k;
                }
            } else {
                t += cnt2;
                if(d.equals("R")) {
                    for(int j = cnt2; j < t; j++) {
                        arrM[j] = cnt2;
                    }
                    cnt2 = j;
                } else {
                    for(int k = cnt2; k < t; k++) {
                        arrM[k] = cnt2 -1;
                    }
                    cnt2 = k;
                }
            }
        }
        
        System.out.println(Arrays.toString(arrN));
        System.out.print(Arrays.toString(arrM));

    }
}