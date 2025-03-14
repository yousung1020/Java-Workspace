package _2_1_java_class;

import java.util.ArrayList;
import java.util.List;

public class grade {
    public static void main(String[] args) {
        List<student> students = new ArrayList<>();

        students.add(new student("yo", 82));
        students.add(new student("a", 34));
        System.out.println(students.get(0).getName());
    }
}
