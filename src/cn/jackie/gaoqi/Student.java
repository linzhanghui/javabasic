package cn.jackie.gaoqi;

public class Student {
	private String name;
	private int id;
	private String gender;
	private int age;
	private int weight;
	
	public void study(){
		System.out.println(name+",我在学习");
	}
	
	public void sayHello(String sName){
		System.out.println(name+"向"+sName+"说你好");
	}
	
	public static void main(String[] args) {
		Student student01 = new Student();
		student01.name = "lzh";
		student01.study();
		student01.sayHello("老高");
	}
}
