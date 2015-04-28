package cn.jackie.some;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("1.txt");
		if(f.exists())
		{
			f.delete();
		} else {
			try{
			f.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("File name:" + f.getName());
		System.out.println("File path:" + f.getPath());
		System.out.println("File abs path:" + f.getAbsolutePath());
		System.out.println("File Parent:" + f.getParent());
		System.out.println(f.exists()?"exists":"not exist");
		System.out.println(f.canRead()?"read":"not read");
		System.out.println(f.isDirectory()?"directory":"not directory");
		System.out.println("File name:" + f.getName());
		System.out.println("File name:" + f.getName());
		System.out.println("File name:" + f.getName());
	}
}
