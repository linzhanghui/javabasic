package cn.jackie.gaoqi;

public class Point {
	double x,y,z;
	public Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	
	public void setX(double _x){
		x = _x;
		
	}
	
	public static void main(String[] args) {
		Point p = new Point(3.2,4,8);
		p.setX(20);
		System.out.println(p.x);
	}
}
