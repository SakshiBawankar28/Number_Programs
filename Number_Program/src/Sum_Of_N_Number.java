//Write a program to display sum of 1 to N numbers?

import java.util.Scanner;

public class Sum_Of_N_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num + " is an even number");
		}
		else
			System.out.println(num + " is an odd number");

	}

}
