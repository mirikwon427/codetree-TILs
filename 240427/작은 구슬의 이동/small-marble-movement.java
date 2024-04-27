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
    public static int getOppoDir(int x) {
        if( x == 0 )
            return 3;
        else if( x == 1 )
            return 2;
        else if( x == 2 )
            return 1;
        else
            return 0;
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

        int x = getDir(d.charAt(0));
        r--;c--;
        for(int i = 0; i < t; i++) {
            int nx = r + dx[x], ny = c + dy[x];
            if(inRange(nx,ny)) {
                r = nx;
                c = ny;
            } else {
                x = getOppoDir(x);
            }
        }
        System.out.print((r+1) + " " + (c+1));
    }
}