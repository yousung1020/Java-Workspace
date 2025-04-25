package baekjoon;

import java.io.*;
import java.util.*;
public class _1018 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            char bw[][] = new char[n][m];

            for(int i = 0; i < n; i++){
                bw[i] = bf.readLine().toCharArray();
            }

            for(int i = 0; i < n - 8; i++){
                for(int j = 0; j < m - 8; j++){

                }
            }

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
