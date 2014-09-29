package cn.jackie.circle;

public class TestThis {
	int i = 0;
	TestThis(int i) {this.i = i;}

	TestThis increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " +i);
	}
	
	public static void main(String[] args)
	{
		TestThis testthis = new TestThis(100);
		TestThis.increment().increment().print();
	}
	
}
