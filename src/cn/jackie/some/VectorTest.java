package cn.jackie.some;

import java.util.*;

public class VectorTest {
	public static void main(String[] args) {
		int b = 0;
		Vector v = new Vector();
		System.out.println("输入一窜数字:");
		while(true)
		{
			try
			{
			b = System.in.read();
			}
			catch(Exception e)
				{
				e.printStackTrace();
				}
			if(b=='\r'||b=='\n')
				break;
			else
			{
				int num = b - '0';
				v.addElement(new Integer(num));
//				'1'=49 '0'=48
			}
			int sum=0;
			Enumeration e = v.elements();
			while(e.hasMoreElements())
			{
				Integer intObj = (Integer)e.nextElement();
				sum += intObj.intValue();
			}
			System.out.println(sum);
			
//			e.hasMoreElements();
//			e.nextElement();
//			
		}
	}
}
