package cn.jackie.designpattern.factory;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		//纽约披萨
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		//覆盖意大利高级奶酪
		toppings.add("Grated Reggiano Cheese");
	}
}
