package cn.jackie.erji;

import java.io.RandomAccessFile;

public class Java_2 {
	public static void main(String[] args) throws Exception{
		long filePoint = 0;
		String s;
		RandomAccessFile file = new RandomAccessFile("Java_2.java","r");
		long fileLength = file.length();
		while(filePoint<fileLength){
			s = file.readLine();
			
			System.out.println(s);
			filePoint = file.getFilePointer();
		}
		file.close();
	}
}
