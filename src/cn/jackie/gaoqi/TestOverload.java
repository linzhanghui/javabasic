package cn.jackie.gaoqi;

public class TestOverload {
	public static void main(String[] args) {
		
		MyMath m1 = new MyMath();
		int sum = m1.add(20.0,10);
		System.out.println(sum);
	}
}


class MyMath{
	public int add(double a,int b){
		return (int)(a+b);
	}
}