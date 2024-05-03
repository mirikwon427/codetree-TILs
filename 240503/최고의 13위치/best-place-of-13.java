import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 20;
    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxCnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j+1] + arr[i][j + 2]);
            }
        }
        System.out.print(maxCnt);
    }
}