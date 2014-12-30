package cn.jackie.gaoqi;

public class TestFor {
	public static void main(String[] args){
		int a=1;
		while(a<=100){
			System.out.println(a);
			a+=2;
		}
		System.out.println("while循环结束！");
		
		for(int i=1;i<=100;i+=2){
			System.out.println(i);
		}
		System.out.println("while循环结束！");	}
}
