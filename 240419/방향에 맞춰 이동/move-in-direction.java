import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 10000;

    public static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());

        n = Integer.parseInt(st.nextToken());
        int x = 0, y = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br. readLine());
            String d = st.nextToken();
            int v = Integer.parseInt(st.nextToken());

            if(d.equals("N")) {
                y += v;
            } else if(d.equals("E")) {
                x += v;
            } else if(d.equals("S")) {
                y -= v;
            } else {
                x -= v;
            }
        }
        System.out.print(x + " " + y);
    }
}