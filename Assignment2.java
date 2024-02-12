/* Jason Yescas
   Object-Oriented Programming : CPSC-24500-001
   2/11/2024
   Assignment 2
   Purpose: To calculate income tax in Javean Dollars */

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		/* variables to assign names and numbers to.
		   also assigning name to scanner */
		Scanner scan = new Scanner(System.in);
		String employeeName; 
		double employeeIncome;
		double above4k;
		double finalIncomeTax;
		
		// this asks for the users' full name and income
		System.out.print("Please enter your first and last name: ");
		employeeName = scan.nextLine();
		System.out.print("Please enter your income in J$: ");
		employeeIncome = scan.nextDouble();
		
		// if the user puts in an income lower than 0, it will terminate the program
		if (employeeIncome < 0) {
			System.out.println("Invalid input, income should be zero or more");
			return;
		}
		
		// anything that is less than or equal to 4000 J$ is tax free
		above4k = employeeIncome - 4000;
		
		// if the left over money was less than or equal to 1500, the tax is 10%
		if (above4k <= 1500) {
			finalIncomeTax = above4k *.10;
		}
		// if it was between 1500 and 28000, the tax is 20%
		else if (above4k <= 28000) {
			finalIncomeTax = 1500 * .10 + (above4k - 1500) * .20;
		}
		// if it goes beyond 28000, then the tax is 40%
		else {
			finalIncomeTax = 1500 * .10 + 28000 * .20 + (above4k - 29500) * .40;
		}
		
		System.out.println("")

	}

}
