package baekjoon;

import java.io.*;
public class _24264 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)))){
            Long n = Long.parseLong(bf.readLine());
            bf.close();
            System.out.println(n * n);
            System.out.println(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
