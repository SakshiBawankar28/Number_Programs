//Write a program to find SUM OF Even and Odd numbers?

import java.util.Scanner;

public class Sum_Of_Even_Odd_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter	the	range to print sum of even and odd nos.....	 : ");
		int num = sc.nextInt();
		
		int even_sum=0, odd_sum=0;
		for(int i=1; i<=num; i++)
		{
			if(i % 2 == 0)
			{
				even_sum += i;
			}
			else
			{
				odd_sum += i;
			}
		}
		System.out.println("Even number sum is " + even_sum +" and odd number sum is "+ odd_sum);
	}
}
