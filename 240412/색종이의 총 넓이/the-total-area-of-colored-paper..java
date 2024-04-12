import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[][] checked = new int[MAX_R+1][MAX_R+1];
    public static int x1, y1, x2, y2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = OFFSET + Integer.parseInt(st.nextToken());
            y1 = OFFSET + Integer.parseInt(st.nextToken());

            for(int x = x1; x < x1 + 8; x++) {
                for(int y = y1; y < y1 + 8; y++) {
                    checked[x][y] = 1;
                }
            }
        }
        int area = 0;
        for(int x = 0; x <= MAX_R; x++) {
            for(int y = 0; y <= MAX_R; y++) {
                if(checked[x][y] > 0) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}