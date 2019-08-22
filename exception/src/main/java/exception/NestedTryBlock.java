package exception;

public class NestedTryBlock {
	
	public static void main(String[] args) {
		
	try{
		int a = 28;
		int b = 0;
		int c = a / b;
		
		System.out.println("Result = " + c);
	
	}catch(ArithmeticException e)
	{
		System.out.println("A number cannot be divide by zero.");
		System.out.println();
	}
	
	try {
	
	try {
		int num = Integer.parseInt("Zalak");
		System.out.println(num);
	
	}catch(NumberFormatException e)
	{
		System.out.println("Number format exception.");
		System.out.println();
	}
	
	try {
		int a[] = new int[4];
		a[5] = 28;
	
	}
	catch(Exception e)
	{
		System.out.println("Handled");
		System.out.println();
	}

	System.out.println("Other Statement");
	
}catch(Exception e)
	{
		System.out.println("Handled and Recovered");
	}
}

}


