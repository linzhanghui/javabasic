package cn.jackie.some;

public class MyKey {
	private String name = null;
	private int age = 0;
	
	public MyKey(String name,int age){
		this.name =name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyKey)
		{
			MyKey objTemp = (MyKey)obj;
			if(name.equals(objTemp.name)&&age==objTemp.age)
			{
				return true;
			}else{return false;}
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	public String toString() {
		return name + ',' +age;
	}
}
