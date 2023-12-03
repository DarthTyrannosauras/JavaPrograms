package app.pen.utils;

import app.pen.core.Brand;
import app.pen.core.Color;
import app.pen.core.Material;

public class PenUtilities {
	public static int idGenerator(Brand penBrand, Color penColor, Material penMaterial) {
		return (penBrand.ordinal()+1)*100+(penColor.ordinal()+1)*10+(penMaterial.ordinal()+1);
	}
}
