package cn.jackie.oo;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	public BirthDay(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	public void setDay(int d){
		day = d;
	}
	
	public void setMonth(int m){
		month = m;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void display(){
		System.out.println(day+" - "+month+" - "+year);
	}
	
}
