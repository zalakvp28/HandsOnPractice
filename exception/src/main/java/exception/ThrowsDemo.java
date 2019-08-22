package exception;

public class ThrowsDemo 
{
	public static void avg() throws ArithmeticException
	{
		System.out.println("Inside Average Function");
		
		throw new ArithmeticException("Demo");
	}
	
	public static void main(String[] args)
	{
		try {
			avg();
		}
		finally
		{
			System.out.println("Exception caught.");
		}
	}
}
