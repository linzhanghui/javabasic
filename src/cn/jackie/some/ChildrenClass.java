package cn.jackie.some;

class ChildrenClass extends FatherClass{
	public int value;
	public void f(){
		super.f();
		value = 200;
		System.out.println("Children's value"+value);
		System.out.println(value);
		System.out.println(super.value);
	}
}
