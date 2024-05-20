import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 19;
    public static final int[][] go = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int cnt5 = 0;
        int cnt6 = 0;
        for(int i = 0; i < MAX_N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < MAX_N; j++) {
                go[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int width = 0;
        int length = 0;
        for(int i = 0; i < MAX_N; i++) {
            for(int j = 0; j < MAX_N - 1; j++) {
                if(cnt1 == 3 || cnt2 == 3 || cnt3 == 3 || cnt4 == 3 || cnt5 == 3 || cnt6 == 3 ) {
                    width = i+1;
                    length = j+1;
                }
                if(cnt1 == 5 || cnt2 == 5 || cnt3 == 5 || cnt4 == 5 || cnt5 == 5 || cnt6 == 5 ) {
                    break;
                }
                if(go[i][j] == 1&& go[i][j+1] == 1){
                    cnt1++;
                    continue;
                } else if(go[i][j] == 1 && go[i][j+1] != 1){
                    cnt1++;
                    break;
                }
                if(go[i][j] == 2 && go[i][j+1] == 2){
                    cnt2++;
                    continue;
                } else if(go[i][j] == 2 && go[i][j+1] != 2){
                    cnt2++;
                    break;
                }
                if(go[j][i] == 1 &&  go[j+1][i] == 1){
                    cnt3++;
                    continue;
                } else if(go[j][i] == 1 && go[j+1][i] != 1){
                    cnt3++;
                    break;
                }
                if(go[j][i] == 2 && go[j+1][i] == 2){
                    cnt4++;
                    continue;
                } else if(go[j][i] == 2 && go[j+1][i] != 2){
                    cnt4++;
                    break;
                }
                if(go[i][j] == 1 &&  go[i+1][j+1] == 1){
                    cnt5++;
                    continue;
                } else if(go[i][j] == 1 && go[i+1][j+1] != 1){
                    cnt5++;
                    break;
                }
                if(go[i][j] == 2 && go[i+1][j+1] == 2){
                    cnt6++;
                    continue;
                } else if(go[i][j] == 2 && go[i+1][j+1] != 2){
                    cnt6++;
                    break;
                }
            }
            if(cnt1 == 5 || cnt2 == 5 || cnt3 == 5 || cnt4 == 5 || cnt5 == 5 || cnt6 == 5 ) {
                break;
            }

        }
        if(cnt2 == 5 || cnt4 == 5 || cnt6 == 5) {
            System.out.println(2);
            System.out.println(width + " " + length);
        } else if(cnt1 == 5 || cnt3 == 5 || cnt5 == 5) {
            System.out.println(1);
            System.out.println(width + " " + length);
        }

    }
}