package knapsack;

public class Item {
	private String name;
	private double weight;
	private double value;
	
	public Item(double weight, double value,String name) {
		this.weight = weight;
		this.value = value;
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
