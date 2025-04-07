package decoratorPattern;

public class Mushroom extends PizzaDecorator {

	public Mushroom(Pizza _pizza) {
		super(_pizza);
		// TODO Auto-generated constructor stub
		description = pizza.getDescription() + ", mushroom";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 30;
	}

}
