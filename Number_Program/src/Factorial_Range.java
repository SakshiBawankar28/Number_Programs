//Write a program to find the FACTORIAL of a given RANGE of numbers?

import java.util.Scanner;

public class Factorial_Range {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			int fact = 1;
			for(int j=1; j<=i; j++)
			{
				fact = fact*j;
			}
			System.out.println(i + "! factorial is "+fact);
		}
	}

}
