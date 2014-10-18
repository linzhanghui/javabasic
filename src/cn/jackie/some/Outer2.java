package cn.jackie.some;

import cn.jackie.some.Outer.Inner;

public class Outer2 {
	int outer_i = 100;
	void test()
	{
		Inner in = new Inner(/*this*/);
		in.display();
	}
	
	class Inner
	{
		void display()
		{
			System.out.println("outer_i = "/*+outer.outer_i*/);
		}
	}
	
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.test();
	}
}
