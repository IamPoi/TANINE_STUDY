package fileEx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx04 {
	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		
		String str = "";
		
		FileReader fr = new FileReader(f);
		int i ;
		while((i = fr.read()) != -1) {
			str += (char)i;
			System.out.print((char)i);
		}
		fr.close();
		System.out.println(str);
		
		
		
	}

}
