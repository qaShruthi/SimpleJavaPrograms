package simplejava;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// 5! = 1* 2*3* 4* 5 = 120
		System.out.println("Enter the factorial Number: ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		long factorial = 1;
		for(int i=1; i<= num ; i++)
		{
			factorial = factorial * i;
		}
System.out.println("Factorial Number of " + num + " is : "  + factorial);
	}

}
