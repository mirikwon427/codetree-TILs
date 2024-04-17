import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 1000000;

    public static int n, m;
    public static int[] distanceA = new int[MAX_T+1];
    public static int[] distanceB = new int[MAX_T+1];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int timeA = 1, timeB = 1;
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            if(i < n) {
                if(d.equals("R")) {
                    while(t --> 0) {
                        distanceA[timeA] = distanceA[timeA - 1] + 1;
                        timeA++;
                    }
                } else {
                    while(t --> 0) {
                        distanceA[timeA] = distanceA[timeA - 1] - 1;
                        timeA++;
                    }
                }
            } else {
                if(d.equals("R")) {
                    while(t --> 0) {
                        distanceB[timeB] = distanceB[timeB - 1] + 1;
                        timeB++;
                    }
                } else {
                    while(t --> 0) {
                        distanceB[timeB] = distanceB[timeB - 1] - 1;
                        timeB++;
                    }
                }
            }
        }
        for(int i = timeA; i <= MAX_T; i++) {
           distanceA[i] = distanceA[timeA-1];
        }
        for(int i = timeB; i < MAX_T; i++) {
            distanceB[i] = distanceB[timeB-1];
        }
        int cnt = 0;
        int timeMax = Math.max(timeA,timeB);
        for(int i = 1; i < timeMax; i++) {
            if(distanceA[i] == distanceB[i]) {
                if(distanceA[i-1] != distanceB[i-1]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}