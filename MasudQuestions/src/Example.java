import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		/*
		 * List<CourseMarker> courses = new ArrayList<>();
		 * 
		 * courses.add(new CourseMarker(20)); courses.add(new CourseMarker(28));
		 * courses.add(new CourseMarker(15)); courses.add(new CourseMarker(63));
		 * courses.add(new CourseMarker(9));
		 * 
		 * Collections.sort(courses, Collections.reverseOrder());
		 * courses.forEach(System.out::println);
		 */

		/*
		 * List<Student> stu = Arrays.asList(new Student[] {
		 * 
		 * new Student(10, "Catherine"), new Student(28, "Irina"), new Student(29,
		 * "Marius"), new Student(8, "Nancy"), new Student(57, "Tad"), new Student(64,
		 * "Jim"), new Student(53,"Nancy"), new Student(17,"Nancy"), });
		 * 
		 * Collections.sort(stu); stu.forEach(System.out::println);
		 */

		List<Student> stu = Arrays.asList(new Student[] {

				new Student(10, "Catherine"), new Student(28, "Irina"), new Student(29, "Marius"),
				new Student(8, "Nancy"), new Student(57, "Tad"), new Student(64, "Jim"), new Student(53, "Nancy"),
				new Student(17, "Nancy"), });

		/*
		 * Collections.sort(stu, new CompareByName()); stu.forEach(System.out::println);
		 */

		// Using Anonymous class

		/*
		 * Collections.sort(stu, new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) {
		 * 
		 * return o1.getId().compareTo(o2.getId()); }
		 * 
		 * });
		 * 
		 * stu.forEach(System.out::println);
		 */
		
		
		// Using Lambda Expression
		/*
		 * Collections.sort(stu, (o1,o2) -> o1.getId().compareTo(o2.getId()) );
		 * 
		 * stu.forEach(System.out::println);
		 */
		
		// Using Lambda Expression comparing multiple things with using ternery operator
		Collections.sort(stu, (o1, o2) -> o1.getName().compareTo(o2.getName()) == 0 ? o1.getId().compareTo(o2.getId())
				: o1.getName().compareTo(o2.getName()));

		stu.forEach(System.out::println);
	}

}
