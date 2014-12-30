package cn.jackie.gaoqi;

import java.util.Scanner;

/**
 * 测试scanner的使用，接收键盘的输入
 * @author lzh
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		System.out.println("刚才的输入为:"+str);
	}
}
