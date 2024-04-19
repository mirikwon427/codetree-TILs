import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 10000;

    public static int n, x, y;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());

        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br. readLine());
            String d = st.nextToken();
            int v = Integer.parseInt(st.nextToken());

            int dir;
            if(d.equals("E")){
                dir = 0;
            } else if(d.equals("S")) {
                dir = 1;
            } else if(d.equals("W")) {
                dir = 2;
            } else {
                dir = 3;
            }
            x += dx[dir] * v;
            y += dy[dir] * v;
        }
        System.out.print(x + " " + y);
    }
}