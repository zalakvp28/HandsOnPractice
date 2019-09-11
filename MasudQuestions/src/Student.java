
public class Student implements Comparable<Student> {

	private Integer id;
	private String name;

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// if we compare names and the names are same then it will be sorted by their id
	@Override
	public int compareTo(Student o) {

		if (this.name.compareTo(o.getName()) == 0) {
			return this.id.compareTo(o.getId());
		} else {
			return this.name.compareTo(o.getName());
		}

	}

}
