package cn.jackie.some;

class Student extends Person{
	private String school;
	
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getInfo(){
		return "name"+getName()+" age"+getAge()+" school\n"+getSchool();
	}
	
}
