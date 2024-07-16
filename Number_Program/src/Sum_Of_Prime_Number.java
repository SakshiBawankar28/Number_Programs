//Write a program to find SUM OF PRIME numbers?

import java.util.Scanner;

public class Sum_Of_Prime_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range to print sum of prime nos : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++)
		{
			if(isPrime(i))
			{
				sum += i;
			}
		}
		System.out.println("Sum of prime number is : " + sum);
		
	}
	
	public static boolean isPrime(int num)
	{
		if(num == 1)
		{
			return false;
		}
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
