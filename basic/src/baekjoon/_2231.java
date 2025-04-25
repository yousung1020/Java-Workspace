package baekjoon;

import java.io.*;
public class _2231 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(bf.readLine());
            for(int i = 0; i < n; i++) {
                int a = i;
                int b = i;
                while (a > 0) {
                    b += a % 10;
                    a = a / 10;
                }
                if(b == n){
                    System.out.println(i);
                    return;
                } else if (i == n - 1) {
                    System.out.println(0);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
