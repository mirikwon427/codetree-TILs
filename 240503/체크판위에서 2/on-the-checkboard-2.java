import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 15;
    public static int r, c;
    public static char[][] grid = new char[MAX_R][MAX_R];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++) {
                String input = st.nextToken();
                grid[i][j] = input.charAt(0);
            }
        }
        int cnt = 0;
        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {
                for(int k = i + 1; k < r - 1; k++) {
                    for(int l = j + 1; l < c -1; l++) {
                        if(grid[0][0] != grid[i][j] &&
                                grid[i][j] != grid[k][l] &&
                                grid[k][l] != grid[r - 1][c - 1]) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}