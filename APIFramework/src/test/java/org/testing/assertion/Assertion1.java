package org.testing.assertion;

public class Assertion1 
{
	public static Boolean assertion_1(int expected, int actual)
	{
		if(expected==actual)
		{
			System.out.println("Assertion is getting passed");
			return true;
		}
		else
		{
			System.out.println("Assertion is failed");
			return false;

		}
	}
		
		public static Boolean assertion_1(String expected, String actual)
		{
			if(expected.equals(actual))
			{
				System.out.println("Assertion is getting passed");
				return true;
				
			}
			else
			{
				System.out.println("Assertion is failed");
				return false;
			}

	}

}
