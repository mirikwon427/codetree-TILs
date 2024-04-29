import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 100;
    public static int[][] answer = new int[MAX_T+1][MAX_T+1];
    public static int n,nx,ny;
    public static int dirNum = 0, x = 10, y = 10;
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int direction(char a) {
        if(a == 'E'){
            return 0;
        } else if(a == 'S'){
            return 1;
        } else if(a == 'W'){
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int cnt = 2;
        answer[x][y] = 1;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            dirNum = direction(dir.charAt(0));
            for(int j = 0; j < d; j++) {
                nx = x + dx[dirNum]; ny = y + dy[dirNum];

                if (answer[nx][ny] == 1) {
                    break;
                }
                x = x + dx[dirNum]; y = y + dy[dirNum];
                answer[nx][ny] = cnt;
                cnt++;
            }
            if (answer[nx][ny] == 1) {
                break;
            }
        }
        System.out.print(cnt -1);

    }
}