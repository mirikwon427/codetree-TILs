import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int dirNum = 0, x = 0, y = 0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static boolean inRange(int a, int b) {
        return ( 0 <= a && a < n && 0 <= b && b < m );
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] answer = new int[n][m];
        answer[x][y] = 1;
        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if(!inRange(nx, ny) || answer[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x = x + dx[dirNum]; y = y + dy[dirNum];
            answer[x][y] = i;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }
        
    }
}