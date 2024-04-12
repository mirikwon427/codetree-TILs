import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 400;
    public static final int OFFSET = 100;

    public static int n;
    public static int[][] checked = new int[MAX_N+1][MAX_N+1];
    public static int x1, y1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = OFFSET + Integer.parseInt(st.nextToken());
            y1 = OFFSET + Integer.parseInt(st.nextToken());

            for(int x = x1; x < x1+8; x++) {
                for(int y = y1+x1; y < y1+x1+8; y++) {
                    checked[x][y]++;
                }
            }
        }
        int area = 0;
        for(int x = x1; x < MAX_N; x++) {
            for(int y = y1; y < MAX_N; y++) {
                if(checked[x][y] >= 1) {
                    area++;
                }
            }
        }
        System.out.println(area);

    }
}