package baekjoon;

import java.io.*;
public class _2798 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            String[] nm = bf.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String[] numbers = bf.readLine().split(" ");
            int[] intNumbers = new int[n];
            for(int i = 0; i < n; i++){
                intNumbers[i] = Integer.parseInt(numbers[i]);
            }

            int sum;
            int max = 0;
            for(int i = 0; i < n - 2; i++){
                for(int j = i + 1; j < n - 1; j++){
                    for(int wowow = j + 1; wowow < n; wowow++){
                       sum = intNumbers[i] + intNumbers[j] + intNumbers[wowow];
                       if(sum <= m && sum > max){
                           max = sum;
                       }
                    }
                }
            }
            System.out.println(max);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
