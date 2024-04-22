import java.util.*;
import java.io.*;

public class Main {
    public static int n;

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0, ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k], ny = j + dy[k];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
                        continue;
                    }
                    if(arr[nx][ny] == 1) {
                        cnt++;
                    }
                }
                if( cnt >= 3 ) {
                    ans++;
                }
                cnt = 0;
            }

        }
        System.out.print(ans);
    }
}