package exception;

public class ThrowSample {
	
	public static void avg()
	{
		try {
			throw new ArithmeticException("Demo");
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Caught.");
		}
	}
	
	public static void main(String[] args) {
		avg();
	}

}
