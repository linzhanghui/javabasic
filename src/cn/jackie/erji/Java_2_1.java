package cn.jackie.erji;

import java.awt.event.*;

import javax.management.timer.Timer;
import javax.swing.JOptionPane;


public class Java_2_1 {
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(10000,listener);
		t.start();
		JOptionPane.showMessageDialog(null,"退出程序吗？");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {
	public void actionPerformed(){
		Date now = new Date();
		System.out.println("At the tone, the time is "+now);
		
	}
}