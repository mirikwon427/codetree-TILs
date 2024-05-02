import java.util.*;
import java.io.*;

public class Main{
    public static final int MAX_N = 100;

    public static int n, m, dirNum = 0, x = 0, y = 0;
    public static char[][] arr = new char[MAX_N][MAX_N];
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return 0 <= n && x < n && 0 <= y && y < m;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int alph = 65;
        arr[x][y] = (char)alph;
        
        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum]; int ny = y + dy[dirNum];

            if(!inRange(nx,ny) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }
            
            x = x + dx[dirNum]; y = y + dy[dirNum];
            alph++;
            if(alph == 91){
                alph = 65;
            }
            arr[x][y] = (char)alph;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}