import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;

    public static int n, m;
    public static int x = 0, y = 0, moveNum = 1, dirNum = 0;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr[x][y] = 1;
        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum]; int ny = y +dy[dirNum];
            if(!inRange(nx, ny) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum]; y = y + dy[dirNum];
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}