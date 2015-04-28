package cn.jackie.some;

import java.util.Properties;
import java.io.*;

public class PropertiesFile {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Properties settings = new Properties();
		try{
		settings.load(new FileInputStream("count.txt"));
		}catch(Exception e){
//			e.printStackTrace();
			settings.setProperty("count", String.valueOf(0));
		}
//		settings.get("count");
		int c = Integer.parseInt(settings.getProperty("count"));
		System.out.println("这是第:"+c +"次运行");
//		settings.put("count",new Integer(c).toString());
		settings.setProperty("count", new Integer(c).toString());
		try{
		settings.store(new FileOutputStream("count.txt"), "Program is used:");
		}catch(Exception e){
			
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.print("total running time: "+(endTime-startTime)+"ms");
	}
}
