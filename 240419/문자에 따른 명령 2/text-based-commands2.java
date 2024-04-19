import java.io.*;
import java.util.*;

public class Main {
    public static int x, y;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String dir = st.nextToken();
        int dirNum = 0;
        for(int i = 0; i < dir.length();i++) {
            char cDir = dir.charAt(i);

            if(cDir == 'L') {
                dirNum = (dirNum -1 + 4) % 4;
            } else if(cDir == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                if(dirNum == 0) {
                    y += dx[dirNum];
                } else if(dirNum == 1) {
                    x += dx[dirNum];
                } else if(dirNum == 2) {
                    y += dx[dirNum];
                } else {
                    x += dx[dirNum];
                }
            }
        }

        System.out.println(x + " " + y);

    }
}