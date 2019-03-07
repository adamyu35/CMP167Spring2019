/*
 * Poweer.java
 * Adam 
 * This program prints out the first nth power of two using for loops
 * 3.7.19
 */
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\t\t Wlcome to Power");;
		System.out.println("\tThis program calculates the first nth powers of 2");
		System.out.print("Please enter value of n:");
		int n   = keyboard.nextInt();
		
		System.out.println("\n______________________________");
		
		int power = 1;
		System.out.println(power);
		for(int i = 2; i <=n; i++ )
		{
			power = power*2;
			System.out.println(power);
			
		}
	}
}
