import java.util.Scanner;

public class Review {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void greeting() {
		System.out.print("Hi");
	}
	public static void title() {
		System.out.println("What's your name?");
		String name = scnr.next();
		greeting();
		if(name.endsWith("e") ||name.endsWith("a")) {
			System.out.println("Miss " + name);
		}
		else {
			System.out.println("Mister " + name);
		}
	}
	public static void greetPeople(int numOfPeople) {
		for(int i=0; i<numOfPeople;i++) {
			title();
		}
	}
		public static void main(String[] args) {
			System.out.println("Enter number of People");
			int num = scnr.nextInt();
			greetPeople(num);
		}
	}


