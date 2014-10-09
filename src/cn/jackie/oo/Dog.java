package cn.jackie.oo;

public class Dog {
	int furColor;
	float height;
	float weight;
	
	void catchMouse(Mouse m) 
	{
//		m.screem();
	}
	
	public static void main(String[] args)
	{
		int i;
		System.out.println(furColor);
		Dog d = new Dog();
		Mouse m = new Mouse();
		d.catchMouse(m);
//		HelloWorld hw = new HelloWorld();
	}
}
