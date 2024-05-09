import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_R = 2000;
    public static final int MAX_D = 2;
    public static int n;
    public static int[][] marathon = new int[MAX_R][MAX_R];
    public static int distance,cnt;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < MAX_D; j++) {
                marathon[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n-2; i++) {
            cnt++;
            int xValue = 0;
            distance = 0;
            for(int j = 0; j < n-1; j++) {
                if((j+1) == cnt){
                    continue;
                }
                for(int x = 0; x < MAX_D; x++) {
                    distance += Math.abs(marathon[xValue][x] - marathon[j+1][x]);
                }
                xValue = j+1;
            }
            min = Math.min(min, distance);
        }
        System.out.print(min);
    }
}