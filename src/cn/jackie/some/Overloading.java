package cn.jackie.some;

class Tree {
	int height;
	Tree() {
		System.out.print("Planting a seeding");
		height = 0;
	}
	Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating new Tree that is "+height+" feet tall");
	}
	void info() {
		System.out.println("Tree is "+ height +" feet tall");
	}
	void info(String s) {
		//有参数
		System.out.println(s+":Tree is "+height +" feet tall");
	}
}



public class Overloading {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		new Tree();
	}
}
