package exception;

public class SampleException {
	public static void main(String[] args) {
		
		//String str = null;
		//System.out.println(str.length());// it will give "Null Pointer Exception".
		
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
		
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The Index of Array is out of bound.");
		}
	}
}
