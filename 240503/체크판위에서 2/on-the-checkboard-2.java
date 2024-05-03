import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 15;
    public static int r, c;
    public static String[][] arr = new String[MAX_R][MAX_R];

    public static int[] dx = {0, 1};
    public static int[] dy = {1, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++) {
                String input = st.nextToken();
                arr[i][j] = input;
            }
        }
        int cnt = 0;
        for(int i = 0; i < r - 1; i++) {
            for(int j = 0; j < c - 2; j++) {
                if(arr[i][j].equals("W")) {
                    if(arr[i + 1][j + 2].equals("B")){
                        cnt++;
                    }
                }
                if(arr[i][j].equals("B")) {
                    if(arr[i + 1][j + 2].equals("W")){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}