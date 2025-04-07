package decoratorPattern;

public abstract class Pizza {
	String description = "Pizza";
	public String getDescription() {
		return description;
	}
	
	public abstract int cost();
}
