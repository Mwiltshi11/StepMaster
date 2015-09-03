package stepdummy;

import java.util.Scanner;

public class OrderChecker {
	public static void main (String[] args ) {
	
	
	double numberOfBolts = 0,numberOfNuts = 0,numberOfWashers = 0;
	double priceOfBolts =.05,priceOfNuts =.03,priceOfWashers=.01;
	double sum = 0;
	Scanner scan = new Scanner(System.in);
	
	
		System.out.println("How many bolts,nuts, and washers in purchase?");
	
	if(numberOfNuts<=numberOfBolts) {
		System.out.println("Check the order: too few nuts");
	}
	
	if(numberOfWashers < (numberOfBolts * 2)) {
		System.out.println("Check the order; too few washers");
		
											  }
											}
	
							}
