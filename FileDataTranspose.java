package glassdoorFAQ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataTranspose
{
	public static void main(String[] args) throws IOException
	{
		
		int i, j;
		int row = 4, column = 2;
        String array[][] = new String[row][column];
        
		// Opening file to Read from
		final String sourceFile = "Y:\\Selenium\\File Moving Task\\Transpose File Data\\File Transpose.txt";
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
					//System.out.println("Word" +j1+ " : "+s);
				}
				stringLine = br.readLine();
				i1++;
				j1 = 0;
				
			}
		}
		br.close();
		
		// Printing original Matrix
		System.out.println("\nThe above matrix before Transpose is:\n");
	  	for(i = 0; i < row; i++)
	  	{
	  		for(j = 0; j < column; j++)
	  		{
	  			System.out.print(String.format("%-20s", array[i][j]));
	  		}
	  		System.out.println("");
	  	}
	  	
	  	// Printing transposed matrix
	 	System.out.println("\nThe above matrix after Transpose is:\n");
	  	for(i = 0; i < column; i++)
	  	{
	  		for(j = 0; j < row; j++)
	  		{
	  			System.out.print(String.format("%-20s", array[j][i]));
	  		}
	  		System.out.println("");
	  	}
	  	
	  	// Write to file
	  	final String destinationFile = "Y:\\Selenium\\File Moving Task\\Transpose File Data\\Transposed File.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile));
		
		for(i = 0; i < column; i++)
	  	{
	  		for(j = 0; j < row; j++)
	  		{
	  			bw.write(String.format("%-20s", array[j][i]));
	  			//bw.write(" ");
	  		}
	  		bw.newLine();
	  	}
	  	bw.close();
	}
}
