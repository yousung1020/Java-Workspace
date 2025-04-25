package baekjoon;

import java.util.StringTokenizer;
import java.io.*;
public class _19532 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            for(int x = -999; x < 1000; x++){
                for(int y = -999; y<1000; y++){
                    if((a * x) + (b * y) == c && (d * x) + (e * y) == f){
                        System.out.println(x + " " + y);
                        break;
                    }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
