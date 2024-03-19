package simplejava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// If you reverse the number it will be same eg:16461

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int orginal_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; // gives you the last digit
			num = num / 10; // removes the last digit
		}
		System.out.println("Reversed number is : " + rev);
		
		//Compare two numbers to see if it is palindrome
		if(orginal_num == rev)
		{
			System.out.println("Number entered is Palindrome");
		}
		else
		{
			System.out.println("Number entered is not Palindrome");
		}
	}

}
