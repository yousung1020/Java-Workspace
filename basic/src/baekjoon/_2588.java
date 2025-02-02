package baekjoon;

import java.util.*;
public class _2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * (((b % 100)) / 10));
        System.out.println(a * (b / 100));
        System.out.println((a * (b % 10)) + ((a * (b % 100 / 10) * 10)) + ((a * (b / 100)) * 100));
    }    
}
