package glassdoorFAQ;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class writeToFile
{
	// Writes 100 random integers to a file, one in each line
	public static void main(String[] args)
	{
		try
		{
			PrintStream writer = new PrintStream( new File("Y:\\Selenium\\File Write\\FileWrite.txt"));
			Random r = new Random();
			int count = 100;

			for(int i = 0; i < count; i++)
			{
				writer.println( r.nextInt() );
			}
				writer.close();
				System.out.print("File Write Successful");
		}
			
		catch(IOException e)
		{
			System.out.println("An error occured while trying to write to the file");
		}
	}
}
