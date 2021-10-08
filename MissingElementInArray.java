package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) 
	{
		//initialize the array
		int[] array= {1,2,3,4,7,6,8};
		
		
		//array length
		int length=array.length;
		
		//sort the array
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		
		for(int i=0; i<length; i++)
		{
			
		}
		
		//print the sorted array as a string
		System.out.println(Arrays.toString(array));
		
		for(int i=0; i<length; i++)
		{
			
			if (array[i]+1 != array[i+1]) 
			{
				// print the number
				System.out.println("Missing element in the array:" + (array[i]+1));
				// once printed break the iteration
				break;
			}
		
		
		}

	}

}
