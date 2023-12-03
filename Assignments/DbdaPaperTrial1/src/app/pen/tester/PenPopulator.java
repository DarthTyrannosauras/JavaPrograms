package app.pen.tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.pen.core.Brand;
import app.pen.core.Color;
import app.pen.core.Material;
import app.pen.core.Pen;

public class PenPopulator {
	public static Map<Integer, Pen> populatepenMap() {
		Map<Integer,Pen> penMap = new HashMap<Integer, Pen>();
		// Color penColor, Material penMaterial, int qtyAvailable, LocalDate
		// stockListingDate, double price
		penMap.put(1,new Pen(Color.BLUE, Material.ALLOY_STEEL, Brand.PARKER, 33, LocalDate.parse("2000-09-23"),
				LocalDate.parse("2023-01-01"), 30));
		penMap.put(2,new Pen(Color.GREEN, Material.METAL, Brand.REYNOLDS, 33, LocalDate.parse("2000-09-24"),
				LocalDate.parse("2023-01-01"), 50));
		penMap.put(3,new Pen(Color.RED, Material.PLASTIC, Brand.CELLO, 33, LocalDate.parse("2000-06-23"),
				LocalDate.parse("2023-08-23"), 40));
		penMap.put(4,new Pen(Color.BLUE, Material.ALLOY_STEEL, Brand.CELLO, 33, LocalDate.parse("2000-02-23"),
				LocalDate.parse("2023-09-23"), 20));
		penMap.put(5,new Pen(Color.BLUE, Material.ALLOY_STEEL, Brand.REYNOLDS, 33, LocalDate.parse("2000-11-23"),
				LocalDate.parse("2023-03-23"), 10));
		penMap.put(6,new Pen(Color.GREEN, Material.PLASTIC, Brand.CELLO, 33, LocalDate.parse("2001-09-14"),
				LocalDate.parse("2023-09-23"), 30));
		return penMap;
	}
}
