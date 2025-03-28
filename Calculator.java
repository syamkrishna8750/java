package syamkrishna;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a integer: ");
			int a= scanner.nextInt();
			System.out.print("Enter a integer: ");
			int b= scanner.nextInt();
			int c=a+b;
			int d=a-b;
			System.out.println("sum:"+c);
			System.out.println("sub:"+d);
			System.out.println("product:"+a*b);
			
			
		}
	}

}
