package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] array= {3,2,11,4,6,7};
		
		int i;
		int length=array.length;
		
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		
		for(i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Second largest number is " + array[length-2]);
	}

}
