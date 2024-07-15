//Write a program to display PRIME NUMBERS from 1 to n?

import java.util.Scanner;

public class Print_1_N_Prime_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i=2; i<=num; i++)
		{
			for(int j=2; j<i; j++) 
			{
				if(i % j == 0)
				{
					break;
				}
				else if(i == j+1)
				{
					System.out.print(i + "  ");
				}
			}
		}
		
		
		
	}

}
