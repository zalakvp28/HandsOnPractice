import java.util.HashMap;

public class Test implements Comparable<Test>{
	
	private String name;
	private int id;
	
	public Test(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we can compare as well with the object class too. but still result will be the same.
		
		//Object p = new Test("Eric",5);
		//Object p1 = new Test("Eric",5);
		
		Test t = new Test("John",10);
		Test t1 = new Test("John",10);
		
		System.out.println(t==t1);
		System.out.println(t.equals(t1));
		
		System.out.println(t.compareTo(t1));
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("Jim", 55);
		"Jim".hashCode();
		hm.get("Jim");
	}

	@Override
	public int compareTo(Test o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	

}
