package decoratorPattern;

public abstract class PizzaDecorator extends Pizza {

	Pizza pizza;
	public PizzaDecorator(Pizza _pizza) {
		pizza = _pizza;
	}
}
