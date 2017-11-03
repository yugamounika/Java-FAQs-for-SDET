package glassdoorFAQ;

import java.util.Scanner;

public class MatrixTranspose
{
	
	public static void main(String[] args)
	{
		int i, j;
		System.out.println("Enter number of rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		String array[][] = new String[row][column];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix:");
	 	for(i = 0; i < row; i++)
	 	{
	 		for(j = 0; j < column; j++)
	 		{
	 			array[i][j] = input.nextLine();
	 			//System.out.print("\t");
	 		}
	 	}
	 	
		System.out.println("\nThe above matrix before Transpose is:");
	  	for(i = 0; i < row; i++)
	  	{
	  		for(j = 0; j < column; j++)
	  		{
	  			System.out.print(String.format("%-15s", array[i][j]));
	  		}
	  		System.out.println(" ");
	  	}
	  	
	 	System.out.println("\nThe above matrix after Transpose is ");
	  	for(i = 0; i < column; i++)
	  	{
	  		for(j = 0; j < row; j++)
	  		{
	  			System.out.print(String.format("%-15s", array[j][i]));
	  		}
	  		System.out.println(" ");
	  	}
	  	s.close();
	  	input.close();
	}
}
