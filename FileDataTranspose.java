package glassdoorFAQ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Read columns and rows from a text file(.txt),
  transposes the matrix,
  writes the transposed matrix to a new file
  */

public class FileDataTranspose
{
	public static void main(String[] args) throws IOException
	{
		
		int i, j;
		int row = 4, column = 2;
        	String array[][] = new String[row][column];
        
		// Opening file to Read from
		final String sourceFile = "path\\to\\file\\Filename.txt";
		BufferedReader br = new BufferedReader(new FileReader(sourceFile));
		
        	String stringLine = br.readLine();
        	int i1 = 0, j1 = 0;
		while (stringLine != null)
		{
			//Splitting a String by taking ' ' as delimiter
			String[] tokens = stringLine.split(" ");
			
			if (!stringLine.trim().isEmpty())
			{
				for(String s:tokens)
				{
					if (!s.trim().isEmpty())
					{
						array[i1][j1] = s;
						j1++;
					}
				}
				stringLine = br.readLine();
				i1++;
				j1 = 0;
				
			}
		}
		br.close();
	  	
	  	// Write to file
	  	final String destinationFile = "Y:\\Selenium\\File Moving Task\\Transpose File Data\\Transposed File.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile));
		
		for(i = 0; i < column; i++)
	  	{
	  		for(j = 0; j < row; j++)
	  		{
	  			bw.write(String.format("%-15s", array[j][i]));
	  		}
	  		bw.newLine();
	  	}
	  	bw.close();
	}
}
