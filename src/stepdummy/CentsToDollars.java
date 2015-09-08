package stepdummy;

import java.util.Scanner;
public class CentsToDollars {

	public static void main (String[] args) {
		
		double dollars,cents;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input cents");
		cents=scan.nextDouble();
		dollars= cents/100 ;
		System.out.println("The dollar amount is " + dollars);
							}

											}
