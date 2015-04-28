package cn.jackie.gaoqi.inherit;

public class Animal {
	String eye;
	
	public void run() {
		System.out.println("跑啊跑！");
	}
	
	public void eat(){
		System.out.println("吃吃！");
	}
	
}

class Mammal extends Animal{
//	String eye;
//	
//	public void run() {
//		System.out.println("跑啊跑！");
//	}
//	
//	public void eat(){
//		System.out.println("吃吃！");
//	}
	
	public void taisheng(){
		this.run();
		System.out.println("我是胎生");
	}
}


class Paxing{
	String eye;
	
	public void run() {
		System.out.println("跑啊跑！");
	}
	
	public void eat(){
		System.out.println("吃吃！");
	}
	
	public void eggSheng(){
		System.out.println("卵升");
	}
}



