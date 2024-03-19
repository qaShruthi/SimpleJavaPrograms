package simplejava;

import java.util.ArrayList;
import java.util.List;

public class SumOfAnArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,6,4};
		List<Integer> SumList = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i< arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array is : " + sum);
		

	}

}
