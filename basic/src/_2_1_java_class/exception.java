package _2_1_java_class;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class exception {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        ArithmeticException E = null;
        try{
            int b = 10 / 0;
            System.out.println(b);
        } catch (ArithmeticException e){
            System.out.println(e.toString());
            E = e;
        } finally{
            assert E != null;
            System.out.println("오류가 발생하였습니다!: " + E.getMessage());
        }
    }
}
