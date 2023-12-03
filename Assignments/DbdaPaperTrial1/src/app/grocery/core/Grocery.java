package app.grocery.core;

public enum Grocery {
BISCUIT(10,25), CHIPS(20,10), CHOCOLATE(10,23);
	private int qty;
	private double price;
	
	private Grocery(int qty,double price){
		this.qty=qty;
		this.price=price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
