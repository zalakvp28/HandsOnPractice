import java.io.Serializable;

public class StudentMarker implements Cloneable, Serializable {

	private int id;
	private CourseMarker course;
	private transient String name;

	public StudentMarker(int id, CourseMarker course, String name) {
		super();
		this.id = id;
		this.course = course;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CourseMarker getCourse() {
		return course;
	}

	public void setCourse(CourseMarker course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentMarker [id=" + id + ", course=" + course + ", name=" + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
