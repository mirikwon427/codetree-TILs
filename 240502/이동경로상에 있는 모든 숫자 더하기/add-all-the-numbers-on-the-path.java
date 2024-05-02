import java.util.*;
import java.io.*;

public class Main {
    public static final int  MAX_T = 100;
    public static int[][] arr = new int[MAX_T][MAX_T];
    public static int n, t, startNum, dirNum = 0, x, y;
    public static String dir;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, -0, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        dir = st.nextToken();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                int input = Integer.parseInt(st.nextToken());
                arr[i][j] = input;
            }
        }
        x = n / 2; y = n / 2;
        int answer = arr[x][y];
        for(int i = 0; i < t; i++) {
            int nx = x + dx[dirNum]; int ny = y + dy[dirNum];
            char dirName = dir.charAt(i);

            if(dirName == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if(dirName == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                if(!inRange(nx,ny)){
                    continue;
                } else {
                    x = x + dx[dirNum];
                    y = y + dy[dirNum];
                    answer += arr[x][y];
                }
            }

        }
        System.out.println(answer);

    }
}