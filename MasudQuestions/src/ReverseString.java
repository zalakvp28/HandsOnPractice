
public class ReverseString {
	
	public static void main(String[] args) {
		
		String name[] = {"Bob","Jenny","Cathie","John","James"};
		
		for(int i=0; i<name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		System.out.println(" ");
		System.out.println("Reverse order of Elements: ");
		
		for(int j=name.length-1; j>=0; j--) {
			
			System.out.println(name[j]);
		}
	}
}
