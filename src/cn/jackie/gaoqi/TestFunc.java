package cn.jackie.gaoqi;

public class TestFunc {
	
	static int a=0;
	
	public static void test01(){
		a++;
		System.out.println("test01 "+a);
		if(a<=10){
			test01();
		} else {
			System.out.println("ok");
		}
	}
	
	public static void test02(){
		
	}
	
	
	
	public static void main(String[] args) {
		test01();
	}
}
