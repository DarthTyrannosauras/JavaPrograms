package app.pen.validations;
import java.util.List;

import app.pen.core.Pen;
public class PenInvalidUtils {
	public static void validateId(int penId) throws PenInvaildException {
		
		if(!(penId < Pen.getPenIdGenerator())) {
			throw new PenInvaildException("Wrong penId Entered!!");
		}	
	}
}
