package cn.jackie.designpattern.factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name; //披萨名称
	String dough; //面团类型
	String sauce; //酱料类型
	ArrayList toppings = new ArrayList(); //一套佐料
	
	void prepare() {
		System.out.println("Preparing "+name);  //准备做**披萨
		System.out.println("Tossing dough... "); //和面
		System.out.println("Adding sauce ...");  //加入酱料
		System.out.println("Adding toppings: "); //加入佐料  
		for(int i = 0; i<toppings.size();i++){
			System.out.println(" " + toppings.get(i));
		}
	}
	
	//烘烤
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	//切片
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	//装盒
	void box(){
		System.out.println("Place pizza in offical pizzastore box");
	}
	public String getName(){
		return name;
	}
}
