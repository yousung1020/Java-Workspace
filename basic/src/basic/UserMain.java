package basic;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        while(true){
            System.out.println("이름을 입력하세요: ");
            String name = sc.nextLine();

            if(name.equals("그만")){
                break;
            }

            System.out.println("나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine();

            userList.add(new User(name, age));
        }
        sc.close();

        try(BufferedWriter bout = new BufferedWriter(new FileWriter("C:/temp/output.txt"))){
            for (User user : userList) {
                bout.write(user.toString());
                bout.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("파일 입력 오류입니다.");
        }

    }
}
