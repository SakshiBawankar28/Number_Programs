//Write a program to check whether the given number is PRIME or not?

import java.util.Scanner;

public class Check_Prime_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		for(int i=2; i<=(num/2); i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		
		if(isPrime)
		{
			System.out.println(num + " is an prime number");
		}
		else
			System.out.println(num + " is not a prime number");

	}

}
