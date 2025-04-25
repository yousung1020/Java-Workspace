package lec_04;
import java.io.*;
public class Ex8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:/Windows/system.ini"); // 원본 파일 경로
		File dest = new File("C:/Temp/system.txt"); // 복사 파일 경로명
		 
		int c;
		
		try {
			BufferedReader bin = new BufferedReader(new FileReader("C:/Windows/system.ini"));
			BufferedWriter bout = new BufferedWriter(new FileWriter("C:/temp/test.txt"));
			
			while ((c = bin.read()) != -1) {
				bout.write((char)c);
			}
			
			System.out.println(src.getPath() + "를 " + dest.getPath() +
					"로 복사하였습니다.");
			
			bin.close();
			bout.close();
			
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
