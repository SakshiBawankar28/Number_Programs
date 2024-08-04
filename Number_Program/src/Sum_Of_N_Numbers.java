//Write a program to check given number is EVEN or ODD?
//Write a program to display sum of 1 to N numbers?

import java.util.Scanner;

public class  Sum_Of_N_Numbers{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++)
		{
			sum += i;
		}
		System.out.print("The sum of 1 to "+ num + " is : "+ sum);

	}

}
