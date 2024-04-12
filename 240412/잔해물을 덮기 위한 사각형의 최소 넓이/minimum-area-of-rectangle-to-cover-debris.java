import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int[][] checked = new int[MAX_R+1][MAX_R+1];
    public static int x1, y1, x2,y2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < 2; i++) {
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

        int a = 0;
        int b = 0;
        for(int x = 0; x <= MAX_R; x++) {
            for(int y = 0; y <= MAX_R; y++) {
                if(checked[x][y] == 1) {
                    a = x - 101;
                    b = y - 100;
                }
            }
        }
        System.out.println(a * b);
    }
}