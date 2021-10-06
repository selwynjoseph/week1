package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		//declare string
		String test="changeme";
		
		//convert string to character array
		char[] ch=test.toCharArray();
		
		//iterate over each character in string
		for(int i=0; i<ch.length; i++)
			
		{
			//find the odd index in the string
			if(i%2!=0)
			{
			
				//System.out.println(ch[i]);
				//use character class to convert char to uppercase
				char ch2 = Character.toUpperCase(ch[i]);
				System.out.println(ch2);
			}
		}



	}

}
