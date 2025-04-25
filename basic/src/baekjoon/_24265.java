package baekjoon;

import java.io.*;

public class _24265 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            Long n = Long.parseLong(bf.readLine());
            System.out.println(n * (n - 1) / 2);
            System.out.println(2);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
