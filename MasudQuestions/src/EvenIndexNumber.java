
public class EvenIndexNumber {
	
	public static void main(String[] args) {
		
		int number[] = {28,29,10,05,03};
		
		for(int i=0; i<number.length; i++) {
			
			System.out.println(number[i]);
		}
		
		System.out.println(" ");
		System.out.println("Only those numbers whoes index number is even:");
		
		for(int j=0; j<number.length; j+=2) {
			
			System.out.println(number[j]);
		}
	}
}
