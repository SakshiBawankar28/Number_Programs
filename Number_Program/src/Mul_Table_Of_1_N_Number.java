//Write a program to display MULTIPLICATION table?

import java.util.Scanner;

public class Mul_Table_Of_1_N_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("enter value of n : ");	
	 	 int n=sc.nextInt();
	 	 
	 	 for(int i=1;i<=n;i++)	
	 	 {	
	 	 	 for(int j=1;j<=10;j++)	
	 	 	 {	
	 	 	 	 System.out.print(j+" * "+i+" = "+j*i+"\t");	
	 	 	 }	
	 	 }	 	
	 	 System.out.println();
		
	}

}
