package baekjoon;
// 해당 문제가 순열이 아닌, 조합으로 접근할 것.
// nCr -> n개중에서 r개를 순서 상관없이 고를 수 있는 조합
// nC3 -> n개중에서 3개를 순서 상관없이 고를 수 있는 경우의 수
// -> n! / 3! -> n * (n-1) * (n-2) / 6

import java.io.*;
public class _24267 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            Long n = Long.parseLong(bf.readLine());
            System.out.println(n * (n-1) * (n-2) / 6);
            System.out.println(3);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
