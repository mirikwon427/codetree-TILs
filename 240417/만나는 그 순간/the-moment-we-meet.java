import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 1000000;

    public static int n,m;
    public static int[] arrA = new int[MAX_T + 1];
    public static int[] arrB = new int[MAX_T + 1];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int cnt1 = 1, cnt2 = 1;
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            if(i < n) {
                while(t --> 0) {
                    if( d.equals("R") ) {
                        arrA[cnt1] = arrA[cnt1 - 1] +1;
                    } else {
                        arrA[cnt1] = arrA[cnt1 - 1] -1;
                    }
                    cnt1++;
                }
            } else {
                while(t --> 0) {
                    if( d.equals("R") ) {
                        arrB[cnt2] = arrB[cnt2 - 1] +1;
                    } else {
                        arrB[cnt2] = arrB[cnt2 - 1] -1;
                    }
                    cnt2++;
                }
            }
        }

        int ans = 0;
        for(int i = 1; i < MAX_T; i++) {
            if(arrA[i] == arrB[i]) {
                ans = i;
                break;
            }
            ans++;
        }

        System.out.println(ans);

    }
}