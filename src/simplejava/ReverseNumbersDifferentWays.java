package simplejava;

import java.util.Scanner;

public class ReverseNumbersDifferentWays {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int number = sc.nextInt();
		
		//1. using algorithm 
		
		/*
		int reverse = 0;
		
		while( number != 0 )
		{
		reverse = reverse * 10 + number%10; // modulus of 10 of a number gives the last digit 
		number = number/10; // when you divide a number by 10 , last digit is removed
		}
		System.out.println("Reverse of entered number is "+reverse);
		
		*/
		
		//2. using String Buffer class method
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev;
		rev = sb.reverse();
		System.out.println("Reverse Number is :" + rev);
	
	    */ 
		
		//3. using StringBuilder class method
		
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		StringBuilder rev;
		rev = sb.reverse();
		System.out.println("Reverse Number is :" + rev);
		

	}

}
