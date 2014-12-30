package cn.jackie.gaoqi;

import java.util.Scanner;

/**
 * 
 * 
 * @author lzh
 *
 */
public class TestScanner02 {
	public static void main(String[] args) {
		
		Scanner s01 = new Scanner(System.in);
		System.out.println("请输入一个加数");
		int a = s01.nextInt();
		System.out.println("请输入一个被加数");
		int b = s01.nextInt();
		int sum = a+b;
		System.out.println("a+b的和为"+sum);
		
	}
}
