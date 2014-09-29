package cn.jackie.shangxuetang;

public class Person {
	private int id;
	private int age = 20;
	
	Person(int _id,int _age) {
		id = _id;
		age = _age;
	}
	/*
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int i)
	{
		age = i;
	}
	
	public int getId()
	{
		return id;
	}
	*/
	
	public static void main(String[] args) {
		Person tom = new Person();
		tom.Person(1, 25);
		Point p = new Point();
	}
}

class Point {
	Point() {}
	int x;
	int y;
}
