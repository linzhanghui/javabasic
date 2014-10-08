package cn.jackie.some;

class Person {
	private int age;
	private String name;
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getinfo()
	{
		return "Name"+name+"\n"+age+"age";
	}
}
