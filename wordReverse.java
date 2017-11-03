package glassdoorFAQ;

import java.util.Scanner;

/*Input: Hello World
  Output: World Hello
  */

public class wordReverse
{
	public static void main(String[] args)
	{
		//Can use any delimiter instead of spaces
		//String delimiter = ":";
		System.out.println("Enter string with chosen delimiter");
		Scanner scan = new Scanner(System.in);
        	String input = scan.nextLine();
        
        	String[] words = input.split(" ");
		//String[] words = input.split(""+delimiter);
		int length = words.length;
		StringBuilder finalString = new StringBuilder(input.length());
		for(int i=length-1;i >= 0;i--)
		{
			finalString.append(words[i]);
			finalString.append(" ");
			//finalString.append(""+delimiter);
		}
		
		System.out.println("Reverse String: "+ finalString.toString());

	}

}
