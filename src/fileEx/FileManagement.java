package fileEx;

import java.io.File;

public class FileManagement {
	
	public static void main(String[] args) {
		File f = new File("Prac");
		if(!f.exists()) { // ���� ���� ����
			f.mkdir(); // ���� ���� �� ����
		}
		
		File f2 = new File("NewFolder");
		if(f2.exists()) {
			f2.delete(); // ���͸� ����
		}
		
		if(f.exists()) {
			f.renameTo(new File("Prac01")); // �̸� ����
		}
		
	}

}
