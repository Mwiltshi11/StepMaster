package stepdummy;

import java.util.Scanner;

public class aTree 
{
	public static void main (String[] args )
	{
		// TODO Auto-generated method stub
		
		int i; // counter
		int t; // number of lines in tree entered by user
		String b = "*";
		char a = '*'; // character to repeat
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of your tree");
		t = input.nextInt();
		for (i= 0; i < t; i++)
		{System.out.print(a);
		System.out.println(repeat("*", i));}
		
				
		}
				
		
public static String repeat(String str, int times)
{
	StringBuilder ret = new StringBuilder();
	for (int i = 0; i <times; i++) ret.append(str);
	return ret.toString();
}
}


