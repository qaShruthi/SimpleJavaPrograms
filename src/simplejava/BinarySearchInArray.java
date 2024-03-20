package simplejava;

import java.util.Arrays;

public class BinarySearchInArray {

	public static void main(String[] args) {
		// Should be in sorted order in order to do binary search
		
	        //int arr[] = {10,20,30,40,50};  
	        //int key = 50;  
	        //int result = Arrays.binarySearch(arr,key);  
	        
	        //case 1: key ==mid
	        //case 2: key > mid, l=mid+1
	        //case 3: key <mid , h=mid-1
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int key =9;
	        int l =0, h=a.length-1;	
	        
	        boolean flag = false;
	        while(l<=h)
	        {
	        	int mid = (l+h)/2;
	        	if(a[mid] == key)
	        	{
	        		 System.out.println("Element found!" + a[mid]); 
	        		 flag= true;
	        		 break;
	        	}
	        	else if(key > a[mid])
	        	{
	        		l= mid+1;
	        	}
	        	else if(key < mid)
	        	{
	        		h= mid-1;
	        	}
	        }
	        if (flag)  
	            System.out.println("Element is found!");  
	        else  
	            System.out.println("Element is not found : ");  
	   

	}

}
