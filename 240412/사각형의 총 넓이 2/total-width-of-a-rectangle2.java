import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_K = 100;

    public static int n;
    public static int[] cntW = new int[MAX_K * 2 + 1];
    public static int[] cntL = new int[MAX_K * 2 + 1];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int cur = MAX_K;
        int answer = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = MAX_K + Integer.parseInt(st.nextToken());
            int y1 = MAX_K + Integer.parseInt(st.nextToken());
            int x2 = MAX_K + Integer.parseInt(st.nextToken());
            int y2 = MAX_K + Integer.parseInt(st.nextToken());

            answer += (x2-x1) * (y2-y1);

            for(int j = x1; j < x2; j++) {
                cntW[j]++;
            }
            for(int k = y1; k < y2; k++) {
                cntL[k]++;
            }
        }
        int a = 0;
        int b = 0;
        for(int i = 0; i < MAX_K * 2; i++) {
            if(cntW[i] >= 2) {
                a++;
            }
            if(cntL[i] >= 2) {
                b++;
            }
        }
        System.out.print(answer - ( a * b ));
    }
}