package simplejava;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOddNumberFromArray {

	public static void main(String[] args) {
		//Find largest number in an array
				int[] numbers = {2,5,8,9,3,6};
				List<Integer>tempArray = new ArrayList<>();
				for(int i =0; i<numbers.length ; i++)
				{
					if(numbers[i] % 2 == 0)
					{
						System.out.println(numbers[i] + " is an even number");
						tempArray.add(numbers[i]);
					}
					else
					{
						System.out.println(numbers[i] + " is an odd number ");
					}
				}
				
				for(int n : tempArray )
				{
					System.out.println("Even Numbers are " + n);
				}
				
				
				
			}


	

}
