/*
 * Area.java
 * Adam 
 * This program implements area functions or methods
 */
import java.util.Scanner;

public class Area {
	static Scanner keyboard = new Scanner(System.in);
	/*
	 * Area : void
	 * inputs: width and length
	 * process: area = width * length
	 * output: area
	 */
public static void Area() {
	
	int width;
	int length;
	int area;
	
	System.out.println("Let's calculate area");
	//input
	
	System.out.println("Enter width");
	width = keyboard.nextInt();
	
	System.out.println("Enter Length");
	length = keyboard.nextInt();
	//process/calculation
	area = width * length;
	
	System.out.println("The area is: " +area);
	//output
  } 
   /*
    * circArea: = void
    * inputs: = radius
    * process: pi * radius^radius
    * output: circArea
    */
   public static void circArea() {
	   double radius;
	   double area;
	   System.out.println("Area of the Circle");
	   
	   System.out.println("Enter radius");
	   radius = keyboard.nextDouble();
	   
	   area = Math.PI * radius * radius;
	   System.out.println("The circle area is: " + area);
   }
   /*
    * triArea = void
    * inputs = base and height
    * process (base * height) / 2
    * output: triArea
    */
   public static void triArea() {
	   double base;
	   double height;
	   double area;
	   System.out.println("Let's calculate the area of a triangle");
	   
	   System.out.println("Enter base");
	   base = keyboard.nextDouble();
	   
	   System.out.println("Enter height");
	   height = keyboard.nextDouble();
	   
	   area = base * height / 2;
	   System.out.println("The triangle area is: " + area );
   }

  public static void main (String[] args) {
	  Area(); //Function call/ invocation
	  circArea();
	  triArea();
  }
}
