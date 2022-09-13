package javaNestedLoop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter the number of rows: ");
		rows = sc.nextInt()	;
		System.out.println("Enter the number of columns: ");
		columns = sc.nextInt();
		System.out.println("Enter the symbol you want to use: ");
		symbol = sc.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
	}

}
