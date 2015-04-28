package cn.jackie.some;

import java.io.BufferedReader;
import java.io.File;

public class CodeCounter {
	static long normalLines = 0;
	static long commentLines = 0;
	static long whiteLines = 0;
	
	public static void main(String[] args){
		File f = new File("\\root");
		File[] codeFiles = f.listFiles();
		boolean comment = false;
		if(f.getName().matches("."\\.java$)){
			parse(f);
		}
		
		System.out.println("normalliens");
		System.out.println("");
		System.out.println("");
	}
	
	private static void parse(File f) {
		try{
		BufferedReader br = new BufferedReader(new File)
		String line ="";
		while(line=br.readLine())!=null{
			if((line.matches("[\\[]"))){
				whiteLines ++;
			} else if(line.startWith("/")&&!line.endsWith("8/){
				commentLines++;
			} else if(true == comment){
				commentLines++;
				if(line.endsWith("/")){
					comment = false;
				}
			} else if
			
		}
	}catch(){
		
	}finally{
		if (br != null){
			
		}
	}
}
