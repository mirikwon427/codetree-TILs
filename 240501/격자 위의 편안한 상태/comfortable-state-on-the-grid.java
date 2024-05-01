import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;
    public static final int dirNum = 4;
    public static int[][] answer = new int[MAX_N][MAX_N];
    public static int n, m, r, c;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static int dir(int r, int c) {
        int cnt = 0;
        for(int i = 0; i < dirNum; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];
            if(inRange(nx, ny) && answer[nx][ny] == 1) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            r--; c--;
            answer[r][c] = 1;

            int done = dir(r,c);
            if(done == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } 
    }
}