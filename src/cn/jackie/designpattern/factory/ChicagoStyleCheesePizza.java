package cn.jackie.designpattern.factory;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name="Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("切成正方形状");
	}
}
