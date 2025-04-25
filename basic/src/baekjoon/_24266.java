package baekjoon;

import java.io.*;
public class _24266 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            Long n = Long.parseLong(bf.readLine());
            System.out.println(n * n * n);
            System.out.println(3);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
