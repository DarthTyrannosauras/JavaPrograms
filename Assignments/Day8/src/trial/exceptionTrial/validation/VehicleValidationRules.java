package trial.exceptionTrial.validation;

import java.text.SimpleDateFormat;
import java.util.Date;

import trial.exceptionTrial.exception.LicenseExpiredException;
import trial.exceptionTrial.exception.SpeedOutOfRangeException;

public class VehicleValidationRules {
	static int MAX_SPEED;
	static int MIN_SPEED;
	static Date LICENSE_EXPIRY;
	
	static {
		MIN_SPEED=40;
		MAX_SPEED=100;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{LICENSE_EXPIRY=sdf.parse("11/12/2024");
		}
		catch(Exception e) {
			System.out.println("License date not found!!");
		}
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed<MIN_SPEED) 
			throw new SpeedOutOfRangeException("Too Slow!!");
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("Too Fast!!");
		System.out.println("OK speed");
	}
	public static void validateLicenseDate() throws LicenseExpiredException{
		Date d = new Date();
		if(d.after(LICENSE_EXPIRY))
			throw new LicenseExpiredException("License Expired!!");
		System.out.println("License OK");
	}
}
