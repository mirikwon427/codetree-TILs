import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_K = 10000;

    public static int n;
    public static int[] a = new int[MAX_K * 2 + 1];
    public static int[] cntB = new int[MAX_K * 2 + 1];
    public static int[] cntW = new int[MAX_K * 2 + 1];
    public static int g, w, b;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int cur = MAX_K;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String c = st.nextToken();

            if(c.equals("L")) {
                while(x-- > 0) {
                    a[cur] = 1;
                    cntW[cur]++;
                    if(x > 0) {
                        cur--;
                    }
                }
            } else {
                while(x-- > 0) {
                    a[cur] = 2;
                    cntB[cur]++;
                    if(x > 0) {
                        cur++;
                    }
                }
            }
        }

        for(int i = 0; i < MAX_K * 2; i++) {
            if(cntW[i] >= 2 && cntB[i] >= 2) {
                g++;
            } else if(a[i] == 1) {
                w++;
            } else if(a[i] == 2) {
                b++;
            }
        }

        System.out.print(w + " " + b + " " + g);
    }
}