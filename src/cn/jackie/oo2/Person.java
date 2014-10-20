package cn.jackie.oo2;

class Person {
	public static final String x="abc";
	public String name = "unkown";
	public int age = -1;
	
	public Person()
	{
//		x = 'abc';
	}
	
	public Person(String name,int age)
	{
//		x = 'abc';
		this.name = name;
		this.age = age;
	}
	public void getInfo()
	{
		System.out.println("name="+name+"age"+age);
	}
}