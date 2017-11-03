package glassdoorFAQ;

import java.util.Scanner;

public class stringReverse
{
	public static void main(String[] args)
	{
		//Can use any delimiter instead of spaces
		
		System.out.println("Enter string with chosen delimiter");
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] words = input.split(" ");
		
		//int stringLength = words.length; // No of words in that string
		//System.out.println(stringLength);
		
		//StringBuilder finalString = new StringBuilder(input.length());
		
		//for(int i=0; i <= stringLength; i++)
		//{
        String reverseString="";
			for(String s:words)
			{
				int wordLength = s.length(); // No of letters in each word
				//int j = wordLength-1;
				
				for(int j = wordLength-1; j >= 0; j--)
				{
					reverseString = reverseString + words.charAt(j);
					//System.out.println(words[j]);
					finalString.append(words[j]);
					finalString.append(" ");
				}
				//j--;
			//}
			
				//finalString.append(words[j]);
				//finalString.append(" ");
				System.out.println("Reverse String: "+ finalString.toString());
		}
		
		//System.out.println("Reverse String: "+ finalString.toString());

	}
}

// Input: Hello World
// Output: olleH dlroW
