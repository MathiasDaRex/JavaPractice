package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// exception =	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions, and runs an exception, a part of the code like an error message
		// 				it stops your program from the normal running, and runs the exception part of the code
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("Enter a whole number to divide");
			int x = sc.nextInt();
			
			System.out.println("Enter a whole number to divide by");
			int y = sc.nextInt();
			
			int z = x/y;
			
			System.out.println("result: " + z);
		}
		// To catch individual exceptions
		catch(ArithmeticException e) {
			System.out.println("u cannot devide by zero stooped!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLZ ENTER A NUMBER YOU DUMBA$$");
		}
		// To catch any exception
		catch(Exception e) {
			System.out.println("Something is wrong dude");
		}
		
		// This always prints, even if an error occurs
		// good thing to add for things like closing scanner objects or files you want to close
		finally {
			System.out.println("This will always pring");
			sc.close();
		}
	}

}
