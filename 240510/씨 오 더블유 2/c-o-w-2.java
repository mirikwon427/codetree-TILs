import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static String cow;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        cow = st.nextToken();

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(cow.charAt(i) == 'C'){
                for(int j = i + 1; j < n; j++) {
                    for(int x = j + 1; x < n; x++) {
                        if(cow.charAt(j) == 'O'&& cow.charAt(x) == 'W') {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}