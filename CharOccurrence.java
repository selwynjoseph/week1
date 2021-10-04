package week1.day2;

public class CharOccurrence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		int i;
		char[] charArray = str.toCharArray();
		
		for(i=0; i<charArray.length; i++)
		{
			if(charArray[i] == 'e')
			{
				count++;
			}
		}
		
		System.out.println("count is " + count);
	
	}

}
