/*
 * 
 */

import java.util.Scanner;

public class Average {
public static void  main (String [] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("\t\t Wlcome to Average");;
	System.out.println("\tThis program calculates the average of the first nth number");
	
	System.out.print("Please enter a value for n: ");
	int n     = keyboard.nextInt();
	int sum = 0;
	System.out.println("\n******************");
	
	for(int i=1; i<=n; i++)
		sum += i;
	
	int average = sum/n;
	
	System.out.print("The average is " + average);
	}
	
  }

