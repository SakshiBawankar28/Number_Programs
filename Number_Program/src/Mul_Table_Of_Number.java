//Write a program to display MULTIPLICATION table?

import java.util.Scanner;

public class  Mul_Table_Of_Number{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}

}
