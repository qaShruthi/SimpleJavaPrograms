package simplejava;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci Series:  0 1 1 2 3 5 8 13 21 34 55 89
		
		int num1 = 0, num2 = 1;
	
		System.out.println("Fibinacci Series is : ");
		for(int i =0; i< 12 ; i++)
		{
			System.out.println(num1 + " ");
			int sum= num1+num2;
			num1 = num2;
			num2= sum;
		}

	}

}
