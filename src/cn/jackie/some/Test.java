package cn.jackie.some;

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		Person person = new Person();
		
		person.setName("none/n");
		person.setAge(1000);
		student.setName("john/n");
		student.setAge(80);
		student.setSchool("fudan");
		System.out.println(person.getInfo());
		System.out.println(student.getInfo());
		
	}
}
