package cn.jackie.algorithm;

public class Tuzi {
	public static void main(String[] args) {
		System.out.println("第一个月的兔子总数： 2");
		System.out.println("第二个月的兔子总数： 2");
		int f1 = 1,f2=1,f,M=24;
			for(int i=3;i<=M;i++){
				f=f2;
				f2=f1+f2;
				f1=f;
				System.out.println("第"+i+"个月第兔子总数"+f2);
			}
	}
}
