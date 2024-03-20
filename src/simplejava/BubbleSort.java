package simplejava;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//Approach 1 
		int[] arr = {4,2,1,5,3};
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		/*
		for(int i =0; i< arr.length -1; i++)
		{
			for(int j=0; j< arr.length - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		*/
		
		
		
		//Approach 2:
		
		Arrays.parallelSort(arr);
		
		System.out.println("Array after sorting: " + Arrays.toString(arr));
		
	}

}
