package knapsack;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Item item = new Item(5,10,"A");
		Item item2 = new Item(4,40,"Certo");
		Item item3 = new Item(6,30,"C");
		Item item4 = new Item(4,50,"Certo");
		
		
//		Items: [ { "weight": 5, "value": 10 }, { "weight": 4, "value": 40 }, { "weight": 6, "value": 30 },
//		         { "weight": 4, "value": 50 } ]
//		In this example, Bob should take the second and fourth item to maximize his value, which, in this case, is 90. 
//		He cannot get more than 90 as his knapsack has a weight limit of 10.
		List<Item> items = new ArrayList<>();
		items.add(item);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		
		Knapsack knap = new Knapsack(10, items);
		
		for (Item i : knap.GonnaTake()) {
			System.out.println(i.getName());
		}
	}

}
