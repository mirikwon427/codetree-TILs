import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 10;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[][] checked = new int[MAX_R+1][MAX_R+1];


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = OFFSET + Integer.parseInt(st.nextToken());
            int y1 = OFFSET + Integer.parseInt(st.nextToken());
            int x2 = OFFSET + Integer.parseInt(st.nextToken());
            int y2 = OFFSET + Integer.parseInt(st.nextToken());


            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    checked[x][y]++;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if(checked[i][j] >= 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}