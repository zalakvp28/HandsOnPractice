import java.io.Serializable;

public class CourseMarker implements Cloneable, Serializable, Comparable<CourseMarker> {

	//private Integer id;
	private int id;

	public CourseMarker(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CourseMarker [id=" + id + "]";
	}

	/*
	 * // if we have wrapper class variable of object class then we can implement
	 * compareTo() like this.
	 * 
	 * @Override public int compareTo(CourseMarker o) { // TODO Auto-generated
	 * method stub return this.id.compareTo(o.getId()); }
	 */

	// But if we have int variable of object class then we can write compareTo() like this
	@Override
	public int compareTo(CourseMarker o) {
		return this.id - o.getId();
	}
}
