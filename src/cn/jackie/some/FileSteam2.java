package cn.jackie.some;
import java.io.*;
public class FileSteam2 {
	public static void main(String[] args)	throws Exception{
		FileWriter out = new FileWriter("hello2.txt");
		out.write("www.bike.so");
		out.close();
		
		char[] buf = new char[1024];
		FileReader in = new FileReader("hello2.txt");
//		in.read(buf)
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
	}
}
