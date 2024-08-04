import java.util.Scanner;

/*
 * Write program to find range of PERFECT NUMBERS
Def:
perfect number, a positive integer that is equal to the sum of its proper divisors. 
The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
Other perfect numbers are 28, 496, and 8,128. 
 */
public class Range_Of_PERFECT_NUMBER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int num = sc.nextInt();

        System.out.println("Perfect numbers up to " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int number) 
    {
        int sum = 1; // 1 is always a divisor

        // Find all proper divisors and sum them
        for (int i = 2; i <= number/2; i++) 
        {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 1; // Check if sum of divisors equals the number itself
    }
}
