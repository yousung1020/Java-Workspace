package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15552 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(reader.readLine());
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < num; i++){
                String input = reader.readLine();
                String parts[] = input.split(" ");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                result.append(number1 + number2).append("\n");
            }
            System.out.println(result);

        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
