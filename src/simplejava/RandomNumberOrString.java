package simplejava;

import java.util.Random;

public class RandomNumberOrString {

	public static void main(String[] args) {

		//Approach 1 : Random Class
		Random rn = new Random();
		int RandomNumber = rn.nextInt(10);
		System.out.println("Random Number is " + RandomNumber);
		
		Double RandomDouble = rn.nextDouble();
		System.out.println("Random Number is " + RandomDouble);
		
		//Approach 2 : Math.random()
		
		Double rnDouble = Math.random();
		System.out.println("Random Number is " + rnDouble);
		
	

	}

}
