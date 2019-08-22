package exception;

public class StringException {
	public static void main(String[] args) {
		try {
			String name = "Zalak Patel";
			System.out.println(name.length());
			
			char c = name.charAt(0);
			c = name.charAt(15);
			System.out.println(c);
			
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException..!!");
		}
	}
}
