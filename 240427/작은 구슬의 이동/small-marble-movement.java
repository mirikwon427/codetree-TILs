import java.util.*;
import java.io.*;

public class Main {
    public static int n,c,t,r;
    public static String d;

    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n ;
    }
    public static int getDir(char a) {
        if(a == 'R')
            return 0;
        else if(a == 'D')
            return 1;
        else if(a == 'U')
            return 2;
        else
            return 3;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = st.nextToken();

        int dir = getDir(d.charAt(0));
        r--;c--;
        while(t--> 0) {
            int nx = r + dx[dir], ny = c + dy[dir];
            if(inRange(nx,ny)) {
                r = nx;
                c = ny;
            } else {
                dir = 3 - dir;
            }
        }
        System.out.print((r+1) + " " + (c+1));
    }
}