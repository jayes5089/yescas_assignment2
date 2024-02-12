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
		
		// this asks for the users' full name
		System.out.print("Please enter your first and last name: ");
		employeeName = scan.nextLine();
		
		/* the try and catch block checks if the user put in
		   anything that wasn't a number. if the user triggers it,
		   the program will terminate. */
		try {
			// this asks for the user's income
			System.out.print("Please enter your income in J$: ");
			employeeIncome = scan.nextDouble();
			
			// if the user puts in an income lower than 0, it will terminate the program
			if (employeeIncome < 0) {
				System.out.println("Invalid input, income should be zero or more");
				return;
			}
		
			// anything that is less than or equal to 4000 J$ is tax free
			above4k = employeeIncome - 4000;
			/* edit: I realized if the income was less than 4000, 
			   it would result in negative income taxes. */
			if (above4k < 0) {
				above4k = 0;
			}
		
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
		
			// prints the employee's full name
			System.out.println("\n\nEmployee name is: "+ employeeName);
		
			/* this prints their income and what they owe in taxes.
		   	the reason why I put the (int) is to take off the decimals
		   	since we do not want fractions. */
			System.out.println("Employee's income is: J$ "+ (int)employeeIncome);
			System.out.println("Calculated income tax is: J$ "+ (int)finalIncomeTax);
		}
		catch (Exception e) {
			System.out.println("Invalid input, income should be zero or more");
			return;
		}
	}
}