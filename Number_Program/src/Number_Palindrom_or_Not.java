//Write a program to check the given number is PALINDROME or not?

import java.util.Scanner;

public class Number_Palindrom_or_Not {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0, rem;
		
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		if(rev == temp)
		{
			System.out.println(temp + " is a palindrome number");
		}
		else {
			System.out.println(temp + " is not a palindrome number");
		}
	}

}
