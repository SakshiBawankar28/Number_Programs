import java.util.Scanner;

/*
 * Write program weather the number is PERFECT NUMBER or not?
Def:
perfect number, a positive integer that is equal to the sum of its proper divisors. 
The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
Other perfect numbers are 28, 496, and 8,128. 
 */

public class PERFECT_NUMBER_OR_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number  : ");
		int num = sc.nextInt();
		
		int sum=1;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i == 0)
			{
				sum += i;
			}
		}
		if(sum == num)
		{
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
