import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * try { FileInputStream fis = new FileInputStream(new File("Student.ser"));
		 * ObjectInputStream ois = new ObjectInputStream(fis);
		 * 
		 * StudentMarker deserializedStudent = (StudentMarker) ois.readObject();
		 * System.out.println(deserializedStudent);
		 * 
		 * }catch (FileNotFoundException e) { // TODO: handle exception
		 * e.printStackTrace();
		 * 
		 * }catch (IOException e) { // TODO: handle exception e.printStackTrace();
		 * 
		 * }catch (ClassNotFoundException e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */
		
		  StudentMarker sm = new StudentMarker(1000, new CourseMarker(2000),"Jim Thomas");
		  
		  System.out.println("Original object"); 
		  System.out.println(sm);
		  
		  try {
		  
		  File file = new File("Student.ser"); 
		  FileOutputStream fos = new FileOutputStream(file); 
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  
		  oos.writeObject(sm); oos.flush(); oos.close();
		  
		  fos.close();
		  
		  
		  }catch(FileNotFoundException e){
			  e.printStackTrace();
		  
		  }catch (IOException e){
			  // TODO: handle exception 
			  e.printStackTrace();
		  }
	}
		 

		/*
		 * try { StudentMarker smClone = (StudentMarker)sm.clone();
		 * System.out.println("Clonned Object"); System.out.println(smClone);
		 * 
		 * 
		 * sm.setId(5555); System.out.println("After Modification");
		 * 
		 * System.out.println("Original object"); System.out.println(sm);
		 * 
		 * System.out.println("Clonned Object"); System.out.println(smClone);
		 * 
		 * 
		 * sm.getCourse().setId(6666); System.out.println("After Modification");
		 * 
		 * System.out.println("Original object"); System.out.println(sm);
		 * 
		 * System.out.println("Clonned Object"); System.out.println(smClone);
		 * 
		 * }catch(CloneNotSupportedException e) { e.printStackTrace(); }
		 */
	}


