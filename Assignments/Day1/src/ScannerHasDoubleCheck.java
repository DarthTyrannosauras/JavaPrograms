import java.util.*;  
public class ScannerHasDoubleCheck{
	public static void main(String args[]){
		System.out.println("Enter 2 double numbers.");
		double num1, num2;
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextDouble()){
			num1 = scan.nextDouble();
			if(scan.hasNextDouble()){
				num2 = scan.nextDouble();
				System.out.println("Average of doubles is: " + (num1+num2)/2);
			}
			else{
				System.out.println("Not Found Double Value ");  
			}
		}
		else{
			System.out.println("Kindly enter number of type double.");  
		}
		scan.close();
	}    
}