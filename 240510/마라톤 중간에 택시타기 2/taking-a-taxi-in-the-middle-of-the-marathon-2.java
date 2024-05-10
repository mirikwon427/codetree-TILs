import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;
    public static final int min = Integer.MAX_VALUE;
    
    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < n - 1; i++) {
            int xValue = 0;
            int dist = 0;
            for(int j = 1; j < n; j++) {
                if(j == i){
                    continue;
                }
                dist += Math.abs(x[xValue]-x[j]) + Math.abs(y[xValue] + y[j]);
            }
            min = Math.min(min, dist);
        }
        System.out.println(min);
    }
}