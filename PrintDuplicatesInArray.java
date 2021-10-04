package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		//initialize array
		int[] array= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int count;
		int i,j;
		
		for(i=0; i<array.length; i++)
		{
			count=0;
			
			for(j=i+1; j<array.length; j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			
			if(count>0)
			{
				System.out.println("Duplicate number is " + array[i]);
				//System.out.println("Number of times its duplicated is " + count);
			}
		}
		

	}

}
