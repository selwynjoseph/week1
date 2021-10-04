package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) 
	{
		//initialze the array
		int[] array= {1,2,3,4,7,6,8};
		
		
		//array length
		int length=array.length;
		
		//sort the array
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		for(int i=0; i<length; i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
