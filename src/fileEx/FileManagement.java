package fileEx;

import java.io.File;

public class FileManagement {
	
	public static void main(String[] args) {
		File f = new File("Prac");
		if(!f.exists()) { // 파일 존재 유무
			f.mkdir(); // 파일 없을 시 생성
		}
		
		File f2 = new File("NewFolder");
		if(f2.exists()) {
			f2.delete(); // 디렉터리 삭제
		}
		
		if(f.exists()) {
			f.renameTo(new File("Prac01")); // 이름 변경
		}
		
	}

}
