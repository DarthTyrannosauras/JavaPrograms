package app.pen.core;

import java.time.LocalDate;

public class Pen {
	Color penColor;
	Material penMaterial;
	Brand penBrand;
	int qtyAvailable;
	LocalDate stockUpdateDate;
	LocalDate stockListingDate;
	double price;
	double discounts;
	static int penIdGenerator;
	int penId;

	static {
		penIdGenerator = 0;
	}

	public Pen(Color penColor, Material penMaterial, Brand brand, int qtyAvailable, LocalDate stockListingDate,
			LocalDate stockUpdateDate, double price) {
		super();
		this.penColor = penColor;
		this.penMaterial = penMaterial;
		this.qtyAvailable = qtyAvailable;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.penId = ++penIdGenerator;
		this.penBrand = brand;
		this.stockUpdateDate = stockUpdateDate;
	}
	
	
	public static int getPenIdGenerator() {
		return penIdGenerator;
	}

	public int getPenId() {
		return penId;
	}

	public int getQtyAvailable() {
		return qtyAvailable;
	}

	public void setQtyAvailable(int qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}

	public Color getPenColor() {
		return penColor;
	}

	public Material getPenMaterial() {
		return penMaterial;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Pen \npenColor=" + penColor + ", penMaterial=" + penMaterial + ", penBrand=" + penBrand
				+ ",\nqtyAvailable=" + qtyAvailable + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", \nprice=" + price + ", discounts=" + discounts + ", penId=" + penId;
	}

}
