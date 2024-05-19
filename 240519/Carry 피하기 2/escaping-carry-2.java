import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 20;
    public static int n;
    public static int[] numbers = new int[MAX_N];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {
                int number1 = numbers[i];
                int number2 = numbers[j];
                int number4 = number1 % 10;
                int number5 = number2 % 10;
                if(number4 + number5 < 10){
                        for(int k = j + 1; k < n; k++) {
                            int number3 = numbers[k];
                            int number6 = number3 % 10;
                            if(number4 + number5 + number6 < 10) {
                                String t = Integer.toString(numbers[i]);

                                for(int len = t.length(); len > 0; len--) {
                                    number4 = number1 %10;
                                    number5 = number2 %10;
                                    number6 = number3 %10;
                                    if(number4 + number5 + number6 > 10){
                                        ans = 0;
                                        break;
                                    } else if(number4 + number5 + number6 < 10) {
                                        number1 = number1 /10;
                                        number2 = number2 /10;
                                        number3 = number3 /10;

                                        ans = numbers[i] + numbers[j] + numbers[k];
                                    }
                                    if(number1 == 0) {
                                        break;
                                    }
                                }
                                result = Math.max(ans, result);
                            }
                        }

                }

            }
        }

        System.out.println(result);
    }
}