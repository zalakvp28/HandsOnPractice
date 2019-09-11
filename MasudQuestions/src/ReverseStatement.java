public class ReverseStatement {
	
	public static void main(String[] args) {
		
		String s[] = {"Something have happened since the last time"};
		
		 for(int j=0; j<s.length; j++) {
			  
			  System.out.println(s[j]); }
			  
			  System.out.println(" "); 
			  System.out.println("Reverse Statement");
			  
			  String r[] = "Something have happened since the last time".split(" ");
		
		String reverse = " "; 
		
		for(int i=r.length-1; i>=0; i--) {
			
			   reverse = reverse + r[i] + " ";
		}
		
		System.out.println(reverse);
		
	}
}
