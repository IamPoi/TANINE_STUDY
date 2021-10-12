package fileEx;

import java.io.File;
import java.io.IOException;

public class RouteClass {
	public static void main(String[] args) throws IOException {
		File dir1 = new File(".");
		File dir2 = new File("..");
		
		System.out.println("AbsolutePate");
		System.out.println ("Current dir-> " +dir1.getAbsolutePath()); 
		System.out.println ("Parent  dir-> " + dir2.getAbsolutePath()); 
		System.out.println("CanonicalPath");//CanonicalPath 
		System.out.println ("Current dir-> " + dir1.getCanonicalPath()); 
		System.out.println ("Parent  dir-> " + dir2.getCanonicalPath()); 
		File dir3 = new File("c:\\");//절대경로지정 
		System.out.println ("c:\\ -> " + dir3.getAbsolutePath()); 
		
		
	}

}
