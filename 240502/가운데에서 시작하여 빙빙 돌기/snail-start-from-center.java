import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100; 
    public static int n, x, y, dirNum = 0;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{-1, 0, 1, 0};
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        x = n-1; y = n-1;
        arr[x][y] = n * n;
        for(int i = (n * n) -1 ; i >= 1; i--) {
            int nx = x + dx[dirNum]; int ny = y + dy[dirNum];

            if(!inRange(nx, ny) || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x = x + dx[dirNum]; y = y + dy[dirNum];
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}