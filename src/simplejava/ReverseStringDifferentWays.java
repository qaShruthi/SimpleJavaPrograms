package simplejava;

import java.util.Scanner;

public class ReverseStringDifferentWays {

	public static void main(String[] args) {
		
		//1. using String concat
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String str = sc.next();
		
		String rev = "";
		/*
		
		int len = str.length();
		
		for(int i =len - 1; i>=0 ; i--)
		{
			rev= rev +str.charAt(i);
		}
		
		System.out.println("Reverse String is " + rev);
		
		*/
		
		//2. using Char[]
		
		/*
		char[] a = str.toCharArray();
		int len = a.length;
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + a[i];
			
		}
		
		System.out.println("Reverse string is  : " + rev );
		
		*/
		
		//3. Using String Buffer
		StringBuffer sb = new StringBuffer(str);
		rev= sb.reverse().toString();
		System.out.println("Reverse string is  : " + rev );
		
	}

}
