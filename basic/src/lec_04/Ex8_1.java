package lec_04;

import java.io.*;
//import java.io.FileReader;
//import java.io.IOException;

public class Ex8_1 {

	public static void main(String[] args) {
		// C:/Users/313/Documents/lyrics.txt
		try {
			// FileReader fin = new FileReader("C:/Users/313/Documents/lyrics.txt");
			BufferedReader bin = new BufferedReader(new FileReader("C:/Users/313/Documents/lyrics.txt"));
			
			BufferedWriter bout = new BufferedWriter(new FileWriter("C:/test.txt"));
			int ch;
			while((ch = bin.read()) != -1) {
				System.out.print((char)ch);
			}
			bin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없어요. 경로를 확인하십시오");
		} catch (IOException e) {
			System.out.println("읽기 에러!!!!");
		} catch (Exception e) {
			System.out.println("다른 에러!!!");
		}
	}

}
