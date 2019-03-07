import java.util.Scanner; 

public class Factorial {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Factorial");;
		System.out.println("\tThis program calculates the factorial of the first nth number");
		
		System.out.print("Please enter a value for n: ");
		int n   = keyboard.nextInt();
		int fact  = 1;
		
		System.out.println("\n**************************");

	for(int i=1; i<=n; i++)
		fact *= i;
	
	System.out.printf("The factorial of %d is %d%n",  n, fact);
	
	System.out.println("*******************************");
	}
}

