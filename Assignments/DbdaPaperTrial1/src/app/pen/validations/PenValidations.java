package app.pen.validations;

import java.time.LocalDate;

import app.pen.core.Brand;
import app.pen.core.Color;
import app.pen.core.Material;
import app.pen.core.Pen;

public class PenValidations {
	// Enter penColor, penMaterial, brand,
	// qtyAvailable,stockListingDate,stockUpdateDate, price
	public static Pen validateAll(String penColor, String penMaterial, String brand, int qtyAvailable,
			String stockListingDate, String stockUpdateDate, double price) throws PenInvaildException {
		Color penColorV=validateColor(penColor);
		Material penMaterialV=validateMaterial(penMaterial);
		Brand penBrand=validateBrand(brand);
		validateQty(qtyAvailable);
		LocalDate listingDate = validateDate(stockListingDate);
		LocalDate updateDate = validateDate(stockUpdateDate);	
		validatePrice(price);
		Pen tempPen = new Pen(penColorV,penMaterialV,penBrand,qtyAvailable,listingDate,updateDate,price);
		return tempPen;
	}
	
	private static int validateQty(int qtyAvailable) throws PenInvaildException {
		if(qtyAvailable <= 0)
			throw new PenInvaildException("Qty entered is not valid!!");
		return qtyAvailable;
	}
	
	private static double validatePrice(double price) throws PenInvaildException {
		if(price <= 0)
			throw new PenInvaildException("Qty entered is not valid!!");
		return price;
	}

	public static Color validateColor(String color) throws IllegalArgumentException {
		return Color.valueOf(color);
	}
	
	public static Material validateMaterial(String material) throws IllegalArgumentException {
		return Material.valueOf(material);
	}
	
	public static Brand validateBrand(String brand) throws IllegalArgumentException {
		return Brand.valueOf(brand);
	}
	
	public static LocalDate validateDate(String date) {
		return LocalDate.parse(date);
	} 
	
}
