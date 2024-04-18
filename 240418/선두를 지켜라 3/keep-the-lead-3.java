import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 1000000;
    public static final int MAX_N = 1000000;

    public static int n, m, v, t;
    public static int[] arrA = new int[MAX_N + 1];
    public static int[] arrB = new int[MAX_N + 1];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int target1 = 1, target2 = 1;
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());

            if(i < n) {
                while(t --> 0) {
                    arrA[target1] = arrA[target1 -1] + v;
                    target1++;

                }
            } else {
                while(t --> 0) {
                    arrB[target2] = arrB[target2 -1] + v;
                    target2++;

                }
            }
        }

        int[] first = new int[target1];
        for(int i = 0; i < target1; i++) {
            if(arrA[i] < arrB[i] ) {
                first[i] = 2;
            } else if(arrA[i] > arrB[i]) {
                first[i] = 1;
            } else {
                first[i] = 3;
            }
        }
        int cnt = 0;

        for(int i = 1; i < target1; i++) {
            if(first[i] == 2 && first[i-1] != 2) {
                cnt++;
            } else if(first[i] == 1 && first[i-1] != 1) {
                cnt++;
            } else if((first[i] == 3 && first[i-1] != 3)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}