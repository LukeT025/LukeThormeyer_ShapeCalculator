/*
 * This program does is make the user entire what they want to compute for cirlce, rectangle, and triangle and it will figure out the area and perimeter
 */
import java.util.Scanner;

/**
 * This class does it set the banner up for the program 
 */
public class ShapeCalculator {
	public static void printWelcomeBanner() {
		System.out.println("*".repeat(50));
		System.out.println(" ".repeat(17) + "Shape Calculator");
		System.out.println("*".repeat(50));
		System.out.println();
	}
	
	/**
	 * This class does it 
	 * a) ask the user for either circle, rectangle or triangle to compute
	 * b) if user enters a letter not mentioned it will yell at them and go back to the beginning 
	 * c) after the user has selected a letter it will ask radius for circle, lenght and width for rectangle, and all the 3 sides for the triangle
	 * d) it will compute the area and perimeter formula 
	 * e) then it will print out those equations 
	 * then repeats back to anwsering the orginal question and keeps doing that until the user puts Q
	 */
	public static void main (String[] args) {
		printWelcomeBanner();
		Scanner sc = new Scanner(System.in);
		boolean runningProgram = true;
		
		while (runningProgram = true) {
			String usersShape;
			boolean contiuneProgram = false;
			
			do {
				System.out.print("Enter 'C' for circle, 'R' for rectangle, 'T' for triangle, or 'Q' for quit: ");
				usersShape = sc.nextLine().toUpperCase();
				if (usersShape.equals("C") || usersShape.equals("R")  || usersShape.equals("T")  || usersShape.equals("Q")) {
					contiuneProgram = true;
				}else {
					System.out.println("What are you doing? You need to enter C,R,T,or Q");
					contiuneProgram = false;
				}
			}while (contiuneProgram == false);
			
			if (usersShape.equals("C")) {
				System.out.print("Enter the radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				double areaC = Math.PI * Math.pow(radius, 2);
				double perimeterC = 2 * Math.PI * radius;
				System.out.printf("The area of the circle is %.2f, and the circumference is %.2f%n", areaC, perimeterC);
			}else if (usersShape.equals("R")) {
				System.out.print("Enter the lenght and width: ");
				double lenght, width;
				lenght = sc.nextDouble();
				width = sc.nextDouble();
				sc.nextLine();
				double areaR = lenght * width;
				double perimeterR = 2*(lenght * width);
				System.out.printf("The area of the rectangle is %.2f, and the perimeter is %.2f%n", areaR, perimeterR);
			}else if (usersShape.equals("T")) {
				System.out.print("Enter the lenghts of the three sides: ");
				double side1, side2, side3;
				side1 = sc.nextDouble();
				side2 = sc.nextDouble();
				side3 = sc.nextDouble();
				sc.nextLine();
				double s = (side1 + side2 + side3) / 2;
				double areaT = Math.sqrt(s * (s - side1) * (s- side2) * (s -side3));
				double perimeterT = side1 + side2 + side3;
				System.out.printf("The area of the triangle is %.2f, and the perimeter is %.2f%n", areaT, perimeterT);
			}else if (usersShape.equals("Q")) {
				System.out.println("Than you for using Shape Calculator!");
				sc.nextLine();
				runningProgram = false;
			}
		}
			
		sc.close();	
	}
}
