package cn.jackie.some;

class RockSub {
	RockSub(int i){
		System.out.print("Rock" + i + " ");
	}
}


public class Rock2 {
	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
			new RockSub(i);
	}
}
