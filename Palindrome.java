package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		//store string 
		String x="madam";
		
		//null string to store each character of string for comparison
		String z="";
	
		
		//iterate string in reverse order 
		for (int i = x.length()-1; i>=0; i--)
		{
			char y=x.charAt(i);
			z=z+y;
		}
		
		//condition to check reversed character in string
		if(x.equalsIgnoreCase(z))
		{
			System.out.println("Palindrome");
			
		}
		//print reversed string
		System.out.println("Reversed string is " + z);

	}

}
