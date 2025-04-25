package lec_04;

import java.util.*;
import java.io.*;
public class UserMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User1> users = new ArrayList<>();

        while(true){
            System.out.println("이름을 입력하세용(\"그만\"입력시 그만함): ");
            String name = sc.nextLine();

            if(name.equals("그만")){
                break;
            }
            int age = sc.nextInt();
            sc.nextLine();

            users.add(new User1(name, age));
        }

        try(BufferedWriter bout = new BufferedWriter(new FileWriter("c:/temp/sysout.txt"))){
            for(User1 user: users){
                bout.write(user.toString());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
