import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

	// if we compare names and the names are same then it will be sorted by their id
	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getName().compareTo(o2.getName()) == 0) {

			return o1.getId().compareTo(o2.getId());
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
