package myfirst;
import java.util.Scanner;

public class Quadratic 
	{
		public static void main ( String[] args )
		{
			double x, quad;
			Scanner input= new Scanner(System.in);
			// TODO Auto-generated method stub
			System.out.println("Please enter a value for x ");
			x=input.nextDouble();

			quad = 3*Math.pow(x, 2)-(8*x)+4; 
			System.out.println("At X = "+x+" the value is "+ quad);
		
		}
	
}
