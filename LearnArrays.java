package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int i;
		
		//initialize the array
		int[] array= {100,49,398,34,1,267};
		
		//length of array
		int length = array.length;
		
		//display the array in console
		System.out.println("Default array");
		for(i=0; i<array.length; i++) {
		
			System.out.println(array[i]);
			
		}
		
		
		//sort the array and then display it
		Arrays.sort(array);
		System.out.println("Sorted array");
		for(i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		
		//second largest number
		System.out.println("Second largest number is " + array[length-2]);
		
		//second smallest number
		System.out.println("Second smallest number is " + array[1]);

	}

}
