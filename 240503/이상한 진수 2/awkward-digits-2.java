import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String binary = sc.next();
        int ans = INT_MIN;
        for(int i = 0; i < (int) binary.length(); i++) {
            binary = binary.substring(0, i) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
            
            int num = 0;
            for(int j = 0; j < (int) binary.length(); j++)
                num = num * 2 + (binary.charAt(j) - '0');
            ans = Math.max(ans, num);
            binary = binary.substring(0, i) + (char)('0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
        }
        System.out.print(ans);
    }
}