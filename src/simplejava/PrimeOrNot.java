package simplejava;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// Prime Number : > 1
		// Prime Number has two factors 1 and itself eg: 2,3,5,7,11,13,17,19
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = false;
		
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}
		
		if (!isPrime) {
			System.out.println("Number is a prime number " + num);
		} else {
			System.out.println("Number is a not prime number " + num);
		}

	}
}
