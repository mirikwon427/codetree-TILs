import java.util.*;
import java.io.*;

public class Main{
    public static final int MAX_N = 1000;

    public static int n;
    public static char[][] arr = new char[MAX_N][MAX_N];

    public static int startNum;
    public static int x, y,moveDir;
    
    public static void initalize(int num){
        if(num <= n) {
            x = 0; y = num - 1; moveDir = 0;
        } else if(num <= n * 2) {
            x = num - n - 1; y = n - 1; moveDir = 1;
        } else if(num <= n * 3) {
            x = n - 1; y = n - (num - 2 * n); moveDir = 2;
        } else if(num < n * 4) {
            x = n - (num - 3 * n); y = 0; moveDir = 3;
        }
    }
    public static void move(int nextDir){
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        x += dx[nextDir];
        y += dy[nextDir];

        moveDir = nextDir;
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int simulate(){
        int moveNum = 0;
        while(inRange(x,y)) {
            if(arr[x][y] == '/') {
                move(moveDir ^ 1);
            } else {
                move(3 - moveDir);
            }
            moveNum++;
        }
        return moveNum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String input = st.nextToken();

            for(int j = 0; j < n; j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        st = new StringTokenizer(br.readLine());
        startNum = Integer.parseInt(st.nextToken());

        initalize(startNum);

        int moveNum = simulate();

        System.out.print(moveNum);
        
    }
}