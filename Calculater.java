package t202011;

import java.util.Scanner;

public class Calculater {
	public static void main(String Arg[]) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The First Value: ");
		double a = obj.nextDouble();
		System.out.println("Enter the Second Value: ");
		double b = obj.nextDouble();


		System.out.println("Enter The Operator(+, -, *, /): ");

		String s = obj.next();

		double Result = 0;

		switch (s) {

		case "+":
			Result = a + b;
			System.out.println("output : "+ Result);
			break;
		case "-":
			Result = a - b;
			System.out.println("output : "+ Result);
			break;
		case "*":
			Result = a * b;
			System.out.println("output : "+ Result);
			break;

		case "%":
			Result = a % b;
			System.out.println("output : "+ Result);
			break;

		default:
			System.out.printf(" Please Enter Correct Operator!!!!");
			return;
		}
		
	}

}
