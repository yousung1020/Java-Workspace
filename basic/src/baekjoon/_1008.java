package baekjoon;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float age_1 = scanner.nextInt();
        float age_2 = scanner.nextInt();
        System.out.println(age_1/age_2);

        scanner.close();
    }
}
