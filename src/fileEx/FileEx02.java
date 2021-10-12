package fileEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx02 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		int fileSize = (int)f.length();
		System.out.println(fileSize);
		
		// 파일 사이즈에 해당하는 배열 만들기
		byte[] b = new byte[fileSize];
		
		FileOutputStream fos = new FileOutputStream("a.txt");
		fos.write(b);
		fos.close();
		
		FileInputStream fis = new FileInputStream("a.txt");
		System.out.println(fis);
		
	}

}
