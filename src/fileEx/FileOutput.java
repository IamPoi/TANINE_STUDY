package fileEx;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) throws IOException {
		// ���� ������ ó������ �����
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		fos.write(72);
		fos.write(101);
		fos.write(108);
		fos.write(108);
		fos.write(111);
//		fos.write("Hello"); // byte ũ�Ⱑ �ƴ϶� �ȵ�
		fos.close();
		
		System.out.println("a.txt ��� �Ϸ�");
		
		// ���� �� �κп� �߰��ϱ�
		fos = new FileOutputStream("a.txt",true);
		
		fos.write('\t');
		fos.write(72);
		fos.write(101);
		fos.write(108);
		fos.write(108);
		fos.write(111);
//		fos.write("Hello"); // byte ũ�Ⱑ �ƴ϶� �ȵ�
		fos.close();
		
		
	}

}
