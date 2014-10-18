package cn.jackie.some;

public class Outer {
	int outer_i = 100;
	void test() {
		Inner in = new Inner();
		in.display();
	}
	class Inner {
		void display() {
			System.out.println("outer_i = " + outer_i);
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}
