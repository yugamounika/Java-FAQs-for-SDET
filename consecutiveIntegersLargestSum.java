/* Given an array of integers (of any value, from MIN_INT to MAX_INT), 
 * how would you find the consecutive integers with the largest sum, 
 * and return their sum
 */

package glassdoorFAQ;

import java.util.Scanner;

public class consecutiveIntegersLargestSum
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
	
		System.out.println("Enter size of array");
		int n = Integer.parseInt(num.nextLine());
	
		Scanner arr = new Scanner(System.in);
		
		int array[] = new int[n];
		System.out.println("Enter array elements");
		for( int i = 0; i < n;i++)
		array[i] = Integer.parseInt(arr.nextLine());
		
		
		System.out.println("Final Sum is " +largestSum(array, n));
	}
	
	public static int largestSum(int[] array, int n)
	{
		
		int Sum = 0, int1 = 0, int2 = 0;
		for(int j = 0; j < n; j++)
		{
			
			int currSum = array[j] + array[j+1];
			
			if(currSum > Sum)
				Sum = currSum;
		}
		System.out.println("The two integers are: " +int1+ " and " +int2);
		return Sum;
	}
}
