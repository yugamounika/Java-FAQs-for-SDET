package glassdoorFAQ;

import java.util.Arrays;

public class removeDuplicatesUsingSimpleWhile
{
	
	//Create an array with all unique elements
	public static int[] removeDuplicates(int[] A)
	{
		if (A.length < 2)
			return A;
		
		int j = 0;
		int i = 1;
		
		while (i < A.length)
		{
			if (A[i] == A[j])
				i++;
			else
			{
				j++;
				A[j] = A[i];
				i++;
			}
		}

		int[] B = Arrays.copyOf(A, j + 1);

		return B;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 4 };
		arr = removeDuplicates(arr);
		
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
