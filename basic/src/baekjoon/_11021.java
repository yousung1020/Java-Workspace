package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _11021 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int t = Integer.parseInt(reader.readLine());
            StringBuilder result = new StringBuilder();
            for(int i = 1; i <= t; i++){
                String input = reader.readLine();
                String parts[] = input.split(" ");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                result.append("Case #").append(i).append(": ").append(number1 + number2).append("\n");
            }
            System.out.println(result);

        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
