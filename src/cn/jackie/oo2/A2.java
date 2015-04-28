package cn.jackie.oo2;

public class A2 {
	public void fun1()
	{
		System.out.println("A func1 is calling");
	}
	public void fun2()
	{
		fun1();
	}
}

class B2 extends A2 {
	public void func1() 
	{
		System.out.println("B func1 is calling");
	}
	public void func2()
	{
		System.out.println("B func2 is calloing");
	}
}

class C2 {
	
	public static void main(String[] args){
		B2 b2 = new B2();
		callA2(b2);
		A2 a2 = b2;
		callA2(new B2());
	}

	public static void callA2(A2 a2){
		a2.fun1();
		a2.fun2();
	}
	
}

class Student {
	private String name;
	private int age;
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		Student st = null;
		if(obj instanceof Student)
		{
			st = (Student)obj;
			if(st.name == name && st.age ==age)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public static void main(String[] args)
	{
		Student st1 = new Student("zhansan",20);
		Student st2 = new Student("wangwu",20);
		if(st1.equals(st2))
			System.out.println("equals");
		else
			System.out.println("not equals");
	}
}



