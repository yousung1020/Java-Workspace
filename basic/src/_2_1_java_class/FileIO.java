package _2_1_java_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/_2_1_java_class/abc.txt"))) {
            String data;
            while ((data = reader.readLine()) != null) {
                System.out.print(data);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
