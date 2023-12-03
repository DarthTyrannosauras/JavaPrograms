/*Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.*/

import java.util.Scanner;
class Operation{
	public static void main(String[] args){
		int num1,num2,result,operation;
		boolean operationCompleted = false;
		Scanner sc = new Scanner(System.in);
		while(!operationCompleted){
			System.out.println("Enter two numbers for operation.");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Enter the operation 1:+ 2:- 3:* 4:/ 5:exit");
			operation = sc.nextInt();
			switch(operation){
				case 1:
						result = num1 + num2;
						System.out.println("Addition of " + num1 + " and " + num2 + " gives " + result);
						break;
				
				case 2:
					result = num1 - num2;
					System.out.println("Subtraction of " + num1 + " and " + num2 + " gives " + result);
					break;
				
				
				case 3:
					result = num1 * num2;
					System.out.println("Multiplication of " + num1 + " and " + num2 + " gives " + result);
					break;
				
				
				case 4:
					if(num2 !=0){
					result = num1 / num2;
					System.out.println("Division of " + num1 + " and " + num2 + " gives " + result);}
					else{
						System.out.println("Denominator is zero!!!!");
					}
					break;
				
				
				case 5:
					System.out.println("Thank you for using Calculator. Exiting...");
					operationCompleted = true;
					break;
				
				
				default:
					System.out.println("Enter Correct choice for operation");
			}
		}
	}
}
