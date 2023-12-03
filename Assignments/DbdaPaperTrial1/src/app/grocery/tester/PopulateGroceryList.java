package app.grocery.tester;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import app.grocery.core.Grocery;
import app.grocery.core.GroceryItem;

public class PopulateGroceryList {
	public static List<GroceryItem> populateGroceryList(){
		List<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("BISCUIT", 10, 20, LocalDateTime.of(2023, 10, 18, 0, 0)));
		groceryList.add(new GroceryItem("TEA", 10, 20, LocalDateTime.of(2023, 10, 18, 0, 0)));
		groceryList.add(new GroceryItem("BISCUITA", 10, 20, LocalDateTime.of(2023, 10, 18, 0, 0)));
		groceryList.add(new GroceryItem("TOAST", 10, 70, LocalDateTime.of(2023, 10, 18, 0, 0)));
		groceryList.add(new GroceryItem("CHOCOLATE", 40, 50, LocalDateTime.of(2023, 10, 18, 0, 0)));
		return groceryList;
	}
}
