package cn.jackie.erji;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.BitSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Java_3 extends JFrame {
	public Java_3(){
		super("BitSet");
		final BitSet sieve = new BitSet(1024);
		
		Container c = getContentPane();
		final JLabel status = new JLabel();
		c.add(status,BorderLayout.SOUTH);
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("从1至1023"+"输入值："));
		
		final JTextField input = new JTextField(10);
		input.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						int val = Integer.parseInt(input.getText());
						if(sieve.get(val))
					}
				}
				);
		
	}
}
