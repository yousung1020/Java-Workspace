import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;

public class test {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = gcd(a, b);

        while (result>0){
            // bw.write("1");
            result--;
        }

        }
}
