package decoratorPattern;

public class ExtraCheese extends PizzaDecorator {

	public ExtraCheese(Pizza _pizza) {
		super(_pizza);
		// TODO Auto-generated constructor stub
		description = pizza.getDescription() + ", extra cheese";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 20;
	}

}
