package cn.jackie.some;
import javax.swing.*;

public class SimpleFrameTest {
	public static void main(String[] args) {
		//new 一个frame;
		SimpleFrame frame = new SimpleFrame();
		//设置可关闭
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
