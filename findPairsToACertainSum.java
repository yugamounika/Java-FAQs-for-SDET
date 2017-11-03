/*
 Given a set of numbers -50 to 50,
 find all pairs that add up to a certain sum that is passed in.
 What's the O notation for what you just wrote?
 Can you make it faster?
 Can you find an O(n) solution?
 Implement the O(n) solution
 */

/*Possible Solutions
 O(n^2) solution is just two double for loops
 O(n log n) solution will use a binary tree
 O(n) solution will use a hash table
 */

package glassdoorFAQ;

import java.util.Hashtable;

public class findPairsToACertainSum
{
	public static String main(String args[])
	{

		public static String findNums(int[] array, int sum)
		{
			String nums = "test";
			Hashtable lookup = new Hashtable();
			for(int i = 0; i < array.length; i++)
			{
				try
				{
					lookup.put(array[i], i);
				}
				catch (NullPointerException e)
				{
					System.out.println("Unable to input data in Hashtable: " + e.getMessage());
				}
			}
			int num2;
			int num1;
			for (int i = 0; i < array.length; i++)
			{
				num2 = sum - array[i];
				Integer index = (Integer)lookup.get(num2);
				if ((lookup.containsKey(num2)) && (index != i))
				{
					num1 = array[i];
					nums = array[i] + ", and " + num2;
					return nums;
				}
			}
			//System.out.println(lookup.get(-51)); return "No numbers exist"; }
			return nums;
		}
	}
}
