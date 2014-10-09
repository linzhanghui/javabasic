package cn.jackie.some;

class SubClass extends SuperClass{
	private int n;
	
	SubClass(int n){
		System.out.println("SubClass("+n+")");
		this.n = n;
	}
	
	SubClass(){
		super(300);
		System.out.println("SubClass()");
	}
	
}
