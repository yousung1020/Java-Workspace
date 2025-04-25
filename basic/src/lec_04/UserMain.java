package lec_04;

import java.io.*;
import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<User> userList = new ArrayList<>();
		// 사용자 입력
		while(true) {
			System.out.println("이름을 입력하세요 (그만 입력시 종료)");
			String name = scanner.nextLine();
			
			if (name.equals("그만")) {
				break;
			}
			
			System.out.println("나이를 입력하세요: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			
			userList.add(new User(name, age));
		}
		
		scanner.close();
		
		// 파일에 User 리스트 저장
		try(BufferedWriter bout = new BufferedWriter(new FileWriter("C:/temp/output.txt"))){
			for(User user : userList) {
				bout.write(user.toString());
				bout.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일 입출력 오류");
		}
	}
}
