package simplejava;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		while (num!=0) {
			sum = sum + num% 10;// will give you last digit
			num = num / 10; // removes the last digit
			count++;
			
		}
		
		System.out.println("Sum of Number of Digits in number is : " + sum);
		
		System.out.println("Number of Digits in number is : " + count);
		
	}

}
