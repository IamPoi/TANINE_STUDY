package fileEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx05 {

	public static void main(String[] args) throws IOException {

		File f = new File("a.txt");

		FileReader fr = new FileReader("a.txt");

		BufferedReader br = new BufferedReader(fr);

		System.out.print(br.readLine());

	}
}
