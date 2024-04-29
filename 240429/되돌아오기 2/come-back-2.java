import java.io.*;

public class Main {
    public static int x = 1, y = 0, elapsedTime = 1;
    public static int ans = -1, dirNum = 0;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dir = br.readLine();

        for(int i = 1; i < dir.length(); i++) {
            elapsedTime++;
            if(dir.charAt(i) == 'L') {
                dirNum = (dirNum + 3) % 4;
                continue;
            }
            if(dir.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4;
                continue;
            }
            x += dx[dirNum];
            y += dy[dirNum];

            if(x == 0 && y == 0) {
                ans = elapsedTime;
                break;
            }
        }
        System.out.print(ans);
    }
}