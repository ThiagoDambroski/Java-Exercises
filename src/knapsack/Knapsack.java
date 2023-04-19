package knapsack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Knapsack {
	
	private double weightLimit;
	
	private List<Item> items;
	private AuxiliarClass auxilar;

	public Knapsack(double weightLimit, List<Item> items) {
		this.weightLimit = weightLimit;
		this.items = items;
		auxilar = new AuxiliarClass();
	}
	
	public List<Item> GonnaTake(){
		List<Item> takeItems = new ArrayList<>();
		List<Item> remaing = this.items;
		double weightLeft = this.weightLimit;
		double big  = auxilar.returingBig(remaing);
		
		remaing.sort(Comparator.comparing(Item :: getValue).reversed());
		for (Item item : remaing) {
			if(item.getWeight() <= weightLeft){
				takeItems.add(item);
				weightLeft -= item.getWeight();
			}
		}
		
		
		return takeItems;
	}
	

}
