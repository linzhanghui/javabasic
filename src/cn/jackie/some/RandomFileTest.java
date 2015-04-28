package cn.jackie.some;
import java.io.*;
public class RandomFileTest {
	public static void main(String[] args) throws Exception{
		Employee e1 = new Employee("zhangsan",23);
		Employee e2 = new Employee("lisi",25);
		Employee e3 = new Employee("wangwu",22);
		
		RandomAccessFile ra = new RandomAccessFile("employee.txt");
		ra.write(e1.name.getBytes());
		ra.write(e1.age);
		ra.write(e2.name.getBytes());
		ra.write(e2.age);
		ra.write(e3.name.getBytes());
		ra.write(e3.age);
		ra.close();
		
		int len = 0;
		byte[] buf = new byte[8];
		String strName = null;
		RandomAccessFile raf = new RandomAccessFile("employee.txt");
		raf.skipBytes(12);
//		raf.read(buf);
		len = raf.read(buf);
		strName = new String(buf,0,len); 
		System.out.println(strName + ":"+raf.read());
		
		raf.seek(0);
		len = raf.read(buf);
		strName = new String(buf,0,len);
		System.out.println(strName+":"+raf.read());
		
		raf.skipBytes(12);
		len = raf.read(buf);
		strName = new String(buf,0,len);
		System.out.println(strName+":"+raf.read());
		
	}
}
