package baekjoon;

import java.util.*;
public class _25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        int n = s.nextInt();
        s.nextLine();
        int[] b = new int[n];
        int c = 0;
        for(int i=0;i<n;i++){
            String a = s.nextLine();
            String[] aa = a.split(" ");
            int[] int_a = new int[aa.length];
            for(int j=0;j<2;j++){
                int_a[j] = Integer.parseInt(aa[j]);
            }
            b[i] = int_a[0] * int_a[1];
            c += b[i];
        }
        if(x==c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
