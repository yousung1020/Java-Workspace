package baekjoon;

import java.util.Scanner;

public class _11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String[] b = line.split(" ");
        long[] c = new long[b.length];
        for(int i=0;i<b.length;i++){
            c[i] = Long.parseLong(b[i]);
        }
        System.out.println(c[0]+c[1]+c[2]);
        s.close();
    }
}
