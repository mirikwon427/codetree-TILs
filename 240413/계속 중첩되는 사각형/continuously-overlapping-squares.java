import java.io.*;
import java.util.*;
public class Main {
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[][] checked = new int[MAX_R+1][MAX_R+1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int[] y2 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] x1 = new int[n];
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1[i] = OFFSET + Integer.parseInt(st.nextToken());
            y1[i] = OFFSET + Integer.parseInt(st.nextToken());
            x2[i] = OFFSET + Integer.parseInt(st.nextToken());
            y2[i] = OFFSET + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int area = 0;
        for(int x = 0; x <= MAX_R; x++) {
            for(int y = 0; y <= MAX_R; y++) {
                if(n % 2 == 0) {
                    if(checked[x][y] == n) {
                        area++;
                    }
                } else {
                    if(checked[x][y] == n-1) {
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}