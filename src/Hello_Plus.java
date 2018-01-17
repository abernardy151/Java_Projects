import java.util.Scanner;

public class Hello_Plus {
	public static void main (String[] args) {
		System.out.println("Input a number to add");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		System.outprintln("Pick another number to add");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("The answer is " + num3);
		
	}
}