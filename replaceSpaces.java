package glassdoorFAQ;

public class replaceSpaces
{
	public static void main(String args[])
	{
		String Str = "This is Java FAQ preparation";
		
		// Counting the number of spaces
		int count = 0;
		for(int i = 0; i < Str.length(); i++)
		{
			if(Str.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.print("Number of whitespaces in\n'" +Str+ "' is: " +count+ "\n\n");
		
		// Creating a string with 'count' number of white spaces
		String newSpace = "";
		for(int k = 0; k < count; k++)
		{
			newSpace = newSpace.concat(" ");
		}
		//System.out.println("x" +newSpace+ "x\n");
		
		// Generating final string using 'replaceAll()'
		String newStr = Str;
		//newStr = newStr.replaceAll("\\b \\b", newSpace);
		newStr = newStr.replaceAll(" ", newSpace);
		System.out.println("Newly generated string is:\n" +newStr);
		
	}
}
