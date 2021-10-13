package fileEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) throws IOException { 
		
		// 파일 사이즈
		File f = new File("a.txt");
		int fileSize = (int)f.length();
		System.out.println(fileSize);
		
		// 파일 사이즈에 해당하는 배열 만들기
		byte[] b = new byte[fileSize];
		
		FileInputStream fis = new FileInputStream("a.txt");
		int pos = 0;
		int size = 10;
		int temp;
		
		while((size = fis.read(b,pos,size)) > 0) {
			pos += size;
			System.out.println(pos);
			temp = b.length - pos;
			System.out.println(temp);
			if(temp < 10) {
				size = temp;
			}
			
		}
		fis.close();
		System.out.println("읽은 바이트 수 : " +pos);
		
	}

}
