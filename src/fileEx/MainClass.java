package fileEx;

import java.io.File;
import java.io.PrintStream;

public class MainClass {
	public static void main(String[] args) {
		
//		File f = new File("FileMain.java");
//		File f = new File("C:\\Users\\ta9\\Desktop\\eclipse_prac\\TANINE_OJT\\src\\fileEx\\MainClass.java"); // ���� ��� ����
		File f = new File("src/launchpay"); // ��� ��� ����(ó�� ��δ� ���� �۾� ����)
		
		
		PrintStream out = System.out;
		
		out.println("isFile() : "+f.isFile()); //�������� �ƴ���
		out.println("isDirectory() : "+f.isDirectory()); //���͸����� �ƴ���
		out.println("isHidden(): " + f.isHidden()); //������������ 
		out.println("lastModified(): " + f.lastModified()); //�������� ������ ��¥ 
		out.println("canRead(): " + f.canRead()); //�б� �Ӽ��� ���� �������� 
		out.println("canWrite(): " + f.canWrite()); //���� �Ӽ��� ���� �������� 
		out.println("getPath(): " + f.getPath()); //��� ��� 
		out.println("getAbsolutePath(): "+ f.getAbsolutePath()); //���� ��� 
		out.println("getName(): " + f.getName()); //���͸� �Ǵ� ������ �̸� 
//		out.println("toURL(): " + f.toURL()); //URL������ ��� 
		out.println("exists(): " + f.exists()); //������ �����ϴ��� 
		out.println("length(): " + f.length()); //������ ����
		
		
		
		
		
		
		
	}

}