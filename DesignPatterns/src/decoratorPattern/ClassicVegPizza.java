package decoratorPattern;

public class ClassicVegPizza extends Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is classic veg pizza";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 249;
	}

}
