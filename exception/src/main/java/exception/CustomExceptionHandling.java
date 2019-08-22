package exception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomExceptionHandling {
	public static void convertDateFormat(String inputDate)
	{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Date date = sdf.parse(inputDate);
			
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-mm-dd");
			String outputDate = outputsdf.format(date);
			
			System.out.println("After changing date format to YYYY-MM-DD : " + outputDate);
		} catch(java.text.ParseException e)
		{
			System.out.println("Some error occurred while converting date formats. ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in format DD/MM/YYYY: ");
		
		String inputDate = sc.nextLine();
		
		convertDateFormat(inputDate);
		
		sc.close();
	}
}
