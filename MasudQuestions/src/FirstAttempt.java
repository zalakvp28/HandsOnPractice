import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstAttempt {
	
	public static void main(String[] args) {
		/*
		 * List<Integer> myList = new ArrayList<Integer>();
		 * 
		 * myList.add(10); myList.add(12); myList.add(41); myList.add(28);
		 * myList.add(29);
		 * 
		 * for (Integer i : myList) { System.out.println(i); }
		 */
		
		// OR
		//myList.forEach(System.out::println);
		
		Map<Integer, String> hm = new HashMap<>(7);
		
		hm.put(10, "John");
		hm.put(15, "Mark");
		hm.put(1, "Terry");
		hm.put(2, "David");
		hm.put(20, "Luke");
		hm.put(13, "Silver");
		hm.put(54, "Black");
		
		/*
		 * for (Map.Entry<Integer, String> i : hm.entrySet()) {
		 * 
		 * System.out.println(i); }
		 */
		
		//OR
		hm.entrySet().forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));
	}
}
