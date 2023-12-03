package app.grocery.core;

import java.time.LocalDateTime;
import java.util.Objects;

public class GroceryItem {
	private String groceryName;
	private int groceryQty;
	private double groceryPrice;
	private LocalDateTime stockUpdateDT;
	
	
	

	public GroceryItem(String groceryName, int groceryQty, double groceryPrice, LocalDateTime stockUpdateDT) {
		super();
		this.groceryName = groceryName;
		this.groceryQty = groceryQty;
		this.groceryPrice = groceryPrice;
		this.stockUpdateDT = stockUpdateDT;
	}

	public String getGroceryName() {
		return groceryName;
	}

	public void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}

	public int getGroceryQty() {
		return groceryQty;
	}

	public void setGroceryQty(int groceryQty) {
		this.groceryQty = groceryQty;
	}

	public double getGroceryPrice() {
		return groceryPrice;
	}

	public void setGroceryPrice(double groceryPrice) {
		this.groceryPrice = groceryPrice;
	}

	public LocalDateTime getStockUpdateDT() {
		return stockUpdateDT;
	}

	public void setStockUpdateDT(LocalDateTime stockUpdateDT) {
		this.stockUpdateDT = stockUpdateDT;
	}

	@Override
	public String toString() {
		return "GroceryItem [groceryName=" + groceryName + ", groceryQty=" + groceryQty + ", groceryPrice="
				+ groceryPrice + ", stockUpdateDT=" + stockUpdateDT + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(groceryName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		return Objects.equals(groceryName, other.groceryName);
	}

}
