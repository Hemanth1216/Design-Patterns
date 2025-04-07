package decoratorPattern;

public class DecoratorPatternDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// veg delight + extra cheese
		Pizza pizza1 = new ExtraCheese(new VegDelight());
		System.out.println(pizza1.getDescription());
		System.out.println(pizza1.cost());
		
		// classic veg + double extra cheese + mushroom
		Pizza pizza2 = new Mushroom(new ExtraCheese(new ExtraCheese(new ClassicVegPizza())));
		System.out.println(pizza2.getDescription());
		System.out.println(pizza2.cost());
	}

}
