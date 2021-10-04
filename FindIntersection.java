package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declare array 1 and array 2
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		int i,j;
		
		//iterate through array 1
		for(i=0; i<array1.length; i++)
		{
			//iterate through array 2
			for(j=0; j<array2.length; j++)
			{
				//compare array 1 and array 2
				if(array1[i]==array2[j])
				{
					//print matched numbers from both arrays in console
					System.out.println("Matched number from both arrays is " + array1[i]);
				}
			}
		}

	}

}
