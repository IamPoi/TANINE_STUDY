package fileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx03 {
	public static void main(String[] args) throws IOException {
		
		String str = "Hello World ";
		
		FileWriter fw = new FileWriter("a.txt",true);
//		FileWriter fw = new FileWriter("a.txt");
		
		fw.write(str);
		fw.close();
	}

}
