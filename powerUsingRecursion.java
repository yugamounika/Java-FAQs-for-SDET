package glassdoorFAQ;

public class powerUsingRecursion
{
	
	public static int exponent(int a, int n)
	{
		if ( n == 0 ) // base
			return 1;
		else // recursion
		{
			a *= exponent(a, n-1);
			return a;
		}

	}
	
	public static void main(String[] args)
	{
		System.out.print(exponent(2, 10));
	}
	
}
