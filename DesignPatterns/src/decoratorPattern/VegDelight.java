package decoratorPattern;

public class VegDelight extends Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is veg delight pizza";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 199;
	}

}
