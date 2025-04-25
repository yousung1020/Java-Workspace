package lec_04;
import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:/spring.jfif");
		File dest = new File("C:/temp/copy.jpg");
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			// BufferedInputStream bin = new BufferedInputStream(new FileInputStream(src));
			// BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(dest)); // 기본 버퍼 사이즈는 8kb
			while ((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
			
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
