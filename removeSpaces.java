package glassdoorFAQ;

public class removeSpaces
{
	public static void main(String args[])
	{
		String S = "This is Java FAQ    preparation";
		
		int count = 0;
		for(int i = 0; i < S.length(); i++)
		{
			
			if(S.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.print("Number of whitespaces in '" +S+ "' is: " +count);
	}
}
