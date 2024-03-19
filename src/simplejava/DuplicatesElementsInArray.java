package simplejava;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 4, 7, 8, 2, 9,34,67 };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
				flag = true;
				break;
				}
			}

		}
		
		if(flag)
		{
			System.out.println("Duplicates are present");
		}
		else
		{
			System.out.println("Duplicates are not present");
			
		}

	}

}
