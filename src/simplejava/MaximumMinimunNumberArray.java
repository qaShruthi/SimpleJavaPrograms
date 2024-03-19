package simplejava;

public class MaximumMinimunNumberArray {

	public static void main(String[] args) {
		int[] arr = {19, 34, 67,34,22,3,66, 89};
		int max = arr[0];
		int min = arr[0];
		for(int i = 1;i<= arr.length-1; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
System.out.println("Maximum Number is : " + max);
System.out.println("Minimum  Number is : " + min);
	}

}
