package stepdummy;

import java.util.Scanner;

public class OrderChecker 
{
	public static void main (String[] args ) 
	{
		
		double numberOfBolts = 0,numberOfNuts = 0,numberOfWashers = 0;
		double priceOfBolts =.05,priceOfNuts =.03,priceOfWashers=.01;
		double sum; 
		Scanner input= new Scanner(System.in);
		
		for( int i=0; i<3; i++)
		{
			
			System.out.println("How many bolts in purchase?");
			numberOfBolts = input.nextDouble();
			System.out.println("How many nuts in purchase?");
			numberOfNuts = input.nextDouble();
			System.out.println("How many washers in purchase?");
			numberOfWashers = input.nextDouble();
			
			if(numberOfNuts < numberOfBolts) 
				System.out.println("Check the order: too few nuts");
			if(numberOfWashers < (numberOfBolts * 2) )
				System.out.println("Check the order; too few washers");
			if( !(numberOfNuts < numberOfBolts) && !(numberOfWashers < (numberOfBolts * 2) ) )
				System.out.println("Order is ok");
			
			sum = (priceOfBolts * numberOfBolts) + (priceOfNuts * numberOfNuts) + (priceOfWashers * numberOfWashers);
			
			System.out.println("Total Cost " + sum);
			
		}
		
	}
}