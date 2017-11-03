package glassdoorFAQ;

public class First100Primes
{
	public static void main(String args[])
	{
		int n = 2;
		int flag = 0;
		for(int i = 2; i <= 5; )
		{
			for( int j = 2; j <= n/2; j++)
			{
				if( n%j == 0)
					flag = 1;
				else
					System.out.println("Prime");
			}
			if(flag != 1)
			{
				System.out.println(n);
				i++;
			}
			flag = 0;
			n++;
		}	
	}
}
