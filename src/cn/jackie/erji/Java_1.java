package cn.jackie.erji;

import javax.swing.JOptionPane;

public class Java_1 {
	public static void main(String[] args) {
		int x,y,result;
		String xVal,yVal;
		
		xVal = JOptionPane.showInputDialog("输入第一个整数");
		yVal = JOptionPane.showInputDialog("输入第二个整数");
		
		x = Integer.parseInt(xVal);
		y = Integer.parseInt(yVal);
		result = x*y;
		
		JOptionPane.showMessageDialog(null, "两个数的积："+result);
		System.exit(0);
	}
}
