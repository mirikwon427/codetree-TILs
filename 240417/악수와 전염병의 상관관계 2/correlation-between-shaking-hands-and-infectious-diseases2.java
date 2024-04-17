import java.util.*;
import java.io.*;

// N= 개발자 수, K= 전염병에 걸리는 악수 횟수, 
// P= 처음 전염병에 걸린 개발자, T= 개발자간 악수 회수
// t초에 x 개발자와 y 개발자가 악수를 나눴음을 의미하고
public class Main {
    public static int n, k, p, T;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        int[] arrT = new int[T];
        int[] arrT2 = new int[T];
        int[] arrX = new int[T];
        int[] arrY = new int[T];
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrT[i] = t;
            arrT2[i] = t;
            arrX[i] = x;
            arrY[i] = y;
        }
        Arrays.sort(arrT2);
        int num = 0;
        int[] ans = new int[n+1];
        int cnt = 0;
        for(int i = 0; i < T; i++) {
            for(int j = 0; j < T; j++) {
                if(arrT2[i] == arrT[j]) {
                    num = j;
                }
            }
            if(cnt < 2){
                if(arrX[num] == p){
                    cnt++;
                    ans[i] = arrY[num];
                } else if(arrY[num] == p) {
                    cnt++;
                    ans[i] = arrX[num];
                }
            }
        }
        int person = 0;
        for(int i = 1; i <= n; i++) {
            if(i == p || i == ans[i]) {
                person = 1;
            }
            System.out.print(person);
        }
    }
}