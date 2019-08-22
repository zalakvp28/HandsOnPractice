package exception;

@SuppressWarnings("serial")
public class UserDefinedException extends Exception
{
	private static int accno[] = {1001,1002,1003,1004,1005};
	
	private static String name[] = {"Zalak","Toral","Nisha","Shreeya","Brinda"};
	
	private static double balance[] = {27000.69,835.24,1600.75,1100.12,5000.0};
	
	UserDefinedException()
	{
		
	}

	public UserDefinedException(String str) 
	{
		super(str);
	}
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("ACC_NO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			
			for(int i=0; i<5; i++)
			{
				System.out.println(accno[i] + "\t" + name[i] + "\t" + balance[i]);
				
				if(balance[i] < 1000)
				{
					UserDefinedException me = new UserDefinedException("Balance is below to $1000.00");
					
					throw me;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
