package cn.jackie.algorithm;

public class ShellSortApp {
	public static void main(String[] args) {
		int maxSize = 5000;
		ArraySh arr;
		arr = new ArraySh(maxSize);
		
		for(int j=0;j<maxSize;j++){
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		
		arr.display();
		long start = System.currentTimeMillis();
		arr.shellSort();
		System.out.println(System.currentTimeMillis()-start +"毫秒");
		arr.display();
	}
}
