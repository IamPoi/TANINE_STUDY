package fileEx;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) throws IOException {
		// 파일 내용을 처음부터 만들기
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		fos.write(72);
		fos.write(101);
		fos.write(108);
		fos.write(108);
		fos.write(111);
//		fos.write("Hello"); // byte 크기가 아니라서 안됨
		fos.close();
		
		System.out.println("a.txt 기록 완료");
		
		// 파일 뒷 부분에 추가하기
		fos = new FileOutputStream("a.txt",true);
		
		fos.write('\t');
		fos.write(72);
		fos.write(101);
		fos.write(108);
		fos.write(108);
		fos.write(111);
//		fos.write("Hello"); // byte 크기가 아니라서 안됨
		fos.close();
		
		
	}

}
