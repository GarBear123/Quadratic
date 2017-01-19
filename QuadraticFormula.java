import java.util.Scanner;
public class QuadraticFormula{
	
	public static int getPlus(int a, int b ,int c){
		int quad = (int) Math.sqrt((Math.pow(b,2)) - (4 * a * c));
		
		return (((-b) + quad))/((2*a));
	}
	public static int getMinus(int a, int b, int c){
	    int quad = (int) Math.sqrt((Math.pow(b,2)) - (4 * a * c));
	    
	    return (((-b) - quad))/((2*a));
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to the Quadratic Formula Solver");
	System.out.println("standard polynomial is ax\u00B2+bx+c");
	System.out.println("Enter number a");
	int first = scan.nextInt();
	System.out.println("Enter number b");
	int second = scan.nextInt();
	System.out.println("Enter number c");
	int third = scan.nextInt();
	
		System.out.println("Positive = " + getPlus(first,second,third));
		System.out.println("Negative = " + getMinus(first,second,third));
	
	}

}