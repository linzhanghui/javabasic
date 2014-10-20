package cn.jackie.oo2;

public class Student extends Person{
	public String school;
	
	public Student()
	{
		super();
	}
	
	public Student(String name, int age)
	{
		super(name,age);
	}
	
	public Student(String name,int age, String school)
	{
		this(name,age);
		this.school = school;
//		super.getInfo();
	}
	
	public void getInfo()
	{
		System.out.println("school="+school +",name"+name+",age"+age);
	}
	
	public void study()
	{
	}
}
