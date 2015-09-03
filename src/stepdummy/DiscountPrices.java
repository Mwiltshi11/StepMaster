package stepdummy;

import java.util.Scanner;

public class DiscountPrices {
	public static void main(String[] args){
		double purchaseAmount, discountedPrice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the amount of the purchase?");
		purchaseAmount=scan.nextDouble();
		discountedPrice= purchaseAmount * .10 + purchaseAmount;
		
		if(purchaseAmount>10) {
		System.out.println("The discounted price is " + discountedPrice);
							  }
		if(purchaseAmount<10) {
		System.out.println("The price is " + purchaseAmount );
		}
		
	}
							 }
