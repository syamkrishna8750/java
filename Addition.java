package syamkrishna;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new
Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int intValue1 =  scanner.nextInt();
		
		System.out.println("Enter the 2nd number");
		int intValue2 =  scanner.nextInt();
		
		int result = intValue1 + intValue2;
		System.out.println(result);
		 
		
		
	}

}
