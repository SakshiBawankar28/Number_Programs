//Write a program to Print 1 to N numbers?

import java.util.Scanner;

public class Print_1_N_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("\nNumbers from 1 to "+num+" is : ");
		for(int i=1; i<=num; i++)
		{
			System.out.println(i);
		}
	}

}
