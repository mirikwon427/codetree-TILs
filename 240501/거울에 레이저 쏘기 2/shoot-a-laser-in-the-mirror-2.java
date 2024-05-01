import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;
    public static int n,cnt, dirNum = 0, nx, ny,start;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static int startNum (int start) {
        int result = 0, x=0, y=0;
        if(start < n) {
            result = no(0, x = 0, y =start-1);
        }else if(n < start && start < n*2){
            result = no(1, x = start-n-1, y =n-1);
        }else if(n*2 < start && start < n*3){
            result = no(2, x = n-1, y =start-(n*2)-1);
        }else if(n*3 < start && start < n*4){
            result = no(3, x = start-(n*3)-1, y = 0);
        }
        return result;
    }
    public static  int no (int dirNum, int x, int y){
        for(int i = 0; i < n; i++) {
            nx = x;
            ny = y;
            cnt++;
            if(!inRange(nx,ny)){
                break;
            }
            if(arr[nx][ny] == 1){
                dirNum++;
            } else {
                dirNum = (dirNum +1) % 4;
            }
            if(dirNum >3) {
                dirNum = 0;
            }
            x += dx[dirNum];
            y += dy[dirNum];
        }

        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int length = n*n;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j < n; j++) {
                char line1 = line.charAt(j);
                if(line1 == ('/')) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 2;
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        int answer = startNum(start);

        System.out.println(answer);

    }
}