import java.io.*;

public class Main {
    public static int x, y, elapsedTime;
    public static int ans = -1, dirNum = 0;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dir = br.readLine();
        for(int i = 0; i < dir.length(); i++) {
            if(dir.charAt(i) == 'L') {
                dirNum = (dirNum + 3) % 4;
            }
            if(dir.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4;
            }
            x += dx[dirNum];
            y += dy[dirNum];

            elapsedTime++;

            if(x == -1 && y == 0) {
                ans = elapsedTime;
                break;
            }
        }
        System.out.print(ans);
    }
}