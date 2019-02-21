import java.util.Scanner;

public class AgeTitle {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userAge;
		System.out.println("Enter your Age");
		userAge = scnr.nextInt();
		
		
	    if (userAge > 25) {
	    	System.out.println("Adult");
	    }
	    else {
	    	System.out.println("young Adult or teen");
	    	
	    if (userAge > 19 && userAge < 25) {
	    	System.out.println("Young Adult");
	     }
	    else {
	    	System.out.println("Adult or teen ");
	    	
	    if (userAge < 19) {
	    	System.out.println("Teen");
	    }
	    else {
	    	System.out.println("Adult or young adult");
	    }
	    }
	    }
	}

}
