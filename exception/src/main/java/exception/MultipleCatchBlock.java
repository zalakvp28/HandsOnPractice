package exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try{
			int a = 28;
			int b = 0;
			int c = a / b;
			
			System.out.println("Result = " + c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception.");
			System.out.println();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divide by zero.");
			System.out.println();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The Index of Array is out of bound.");
		}
		
		finally {
			System.out.println("Finally block always being executed.");
		}
	}
}

