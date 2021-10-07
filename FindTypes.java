package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		
		String test="$$ Welcome to 2nd Class of Automation $$ ";
		
		int letter=0, space=0, number=0, specialchar=0;
		
		char[] charArray=test.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			
			if(Character.isLetter(charArray[i]))
			{
				letter++;
			}
			
			else if(Character.isDigit(charArray[i]))
			{
				number++;
			}
			
			else if(Character.isSpaceChar(charArray[i]))
			{
				space++;
			}
			
			else
			{
				specialchar++;
			}
		}
		
		System.out.println("Number of letters are " + letter);
		System.out.println("Number of spaces are " + space);
		System.out.println("Number of digits are " + number);
		System.out.println("Number of special characters are " + specialchar);
	}

}
