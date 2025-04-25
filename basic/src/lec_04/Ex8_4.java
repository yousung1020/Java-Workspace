package lec_04;
import java.io.*;
import java.util.*;

public class Ex8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:/Users/313/Documents/test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0 , line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
