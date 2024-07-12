//Write a program to Print REVERSE of N to 1 numbers?

import java.util.Scanner;

public class Print_Reverse_N_1_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("\nNumbers from  "+num+" to 1 is : ");
		for(int i=num; i>=1; i--)
		{
			System.out.println(i);
		}
	}

}
