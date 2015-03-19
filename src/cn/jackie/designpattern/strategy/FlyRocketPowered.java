package cn.jackie.designpattern.strategy;

public class FlyRocketPowered implements FlyBehavior{
	public void fly() {
		System.out.println("i'm flying with a rocket");
	}

}
