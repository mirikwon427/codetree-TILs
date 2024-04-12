import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 2000;
    public static final int OFFSET = 1000;

    public static int[][] checked = new int[MAX_R+1][MAX_R+1];
    public static int x1, y1, x2,y2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = OFFSET + Integer.parseInt(st.nextToken());
            y1 = OFFSET + Integer.parseInt(st.nextToken());
            x2 = OFFSET + Integer.parseInt(st.nextToken());
            y2 = OFFSET + Integer.parseInt(st.nextToken());

            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    checked[x][y] = i + 1;

                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < MAX_R + 1; i++) {
            for(int j = 0; j < MAX_R + 1; j++) {
                if(checked[i][j] == 1 || checked[i][j] == 2) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}