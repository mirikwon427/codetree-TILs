import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 1000000;

    public static int n, m;
    public static int[] distanceA = new int[MAX_N+1];
    public static int[] distanceB = new int[MAX_N+1];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int timeA = 1, timeB = 1;
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            if(i < n){
                while(t --> 0) {
                    distanceA[timeA] = distanceA[timeA - 1] + v;
                    timeA++;
                }
            } else {
                while(t --> 0) {
                    distanceB[timeB] = distanceB[timeB - 1] + v;
                    timeB++;
                }
            }
        }
        int leader = 0, cnt = 0;;
        int[] ans = new int[MAX_N];
        for(int i = 1; i < timeA; i++) {
            if(distanceA[i] > distanceB[i]){
                if(leader == 2){
                    cnt++;
                }
                leader = 1;
            } else if(distanceA[i] < distanceB[i]) {
                if(leader == 1){
                    cnt++;
                }
                leader = 2;
            }
        }
        System.out.println(cnt);
    }
}