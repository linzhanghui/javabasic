package cn.jackie.some2;

class Person{
	public String name="unknown";
	public int age = -1;
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void getInfo(){
		System.out.println("name="+name+",age="+age);
	}
}

class Student extends Person {
	public String school = "unknown";
	public Student() {
//		super("zhan1san",15);
		super();
	}
	public Student(String name,int age,String school){
		super(name,age);
		this.school = school;
	}
	
	public void study(){
		System.out.println("studying");
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student st = new Student("zhans2an",30,"大学");
//		st.name = "zhangsan";
//		st.age = 20;
//		st.getInfo();
		st.study();
	}
}
