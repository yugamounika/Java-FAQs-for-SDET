package glassdoorFAQ;

import java.util.Scanner;

public class stringToInt
{
	public static void main(String args[])
	{
		System.out.println("Enter the type of String:\n 1. Int\n 2. Double\nClick 'Enter' to run automatically");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		switch (choice)
		{
		case "1":
			//String str = "8955";
			System.out.println("Enter an Integer string");
			Scanner in1 = new Scanner(System.in);
	        String inputString1 = in1.nextLine();
	        
			int no1 = Integer.parseInt(inputString1);
			System.out.println("Output>>> " + no1);
			
			break;
			
		case "2":
			//String str = "89.55";
			System.out.println("Enter a double string");
			Scanner in2 = new Scanner(System.in);
	        String inputString2 = in2.nextLine();
	        
			double no2 = Double.parseDouble(inputString2);
			System.out.println("Output>>> " + no2);
			
			break;
			
		default:
			String str = "8955";
			int no3 = Integer.parseInt(str);
			System.out.println("Output>>> " + no3);
			
			String strDouble = "89.55";
			double no4 = Double.parseDouble(strDouble);
			System.out.println("Output>>> " + no4);
		}		
	}
}
