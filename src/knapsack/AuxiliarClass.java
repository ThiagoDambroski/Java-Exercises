package knapsack;

import java.util.List;

public class AuxiliarClass {
	
	
	public AuxiliarClass() {
		
	}
	
	public double returingBig(List<Item> items) {
		double big = 0;
		for (Item item : items) {
			if(item.getValue() > big ) {
				big = item.getValue();
			}
		}
		return big;
	}
	
	
}
