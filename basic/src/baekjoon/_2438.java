package baekjoon;
import java.util.Scanner;

public class _2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= t; i++){
            for(int j = 1; j <= i; j++) {
                result.append("*");
            }
            System.out.println(result);
            result.setLength(0);
        }
        input.close();
    }
}
