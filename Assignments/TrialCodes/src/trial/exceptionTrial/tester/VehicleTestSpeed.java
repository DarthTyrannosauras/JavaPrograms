package trial.exceptionTrial.tester;

import java.util.Date;
import java.util.Scanner;

import trial.exceptionTrial.exception.LicenseExpiredException;
import trial.exceptionTrial.exception.SpeedOutOfRangeException;
import static trial.exceptionTrial.validation.VehicleValidationRules.*;
//import trial.exceptionTrial.validation.*;
//import static trial.exceptionTrial.validation.VehicleValidationRules.validateSpeed;
public class VehicleTestSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			validateLicenseDate();
			System.out.println("Enter vehicle speed");
			validateSpeed(sc.nextInt());
			Date d = new Date();
			System.out.println(d);
		} catch (SpeedOutOfRangeException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println(e);
		} catch (LicenseExpiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
