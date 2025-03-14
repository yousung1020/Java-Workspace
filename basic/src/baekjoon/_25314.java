package baekjoon;

import java.util.*;

public class _25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        int a = s.nextInt();
        int repeat = a/4;
        for(int i=1; i<repeat;i++){
            b.append("long ");
        }
        b.append("long int");
        System.out.println(b.toString());
    }
}
