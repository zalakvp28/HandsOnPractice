import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class StringIO {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			
			bw.write("Hello Zalak, ");
			//bw.newLine();
			bw.write("you are so beautiful.");
			bw.newLine();
			bw.write("Thankyou so much..!!");
			bw.flush();
			bw.close();
		}
		
		catch (IOException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		try {
			
			 BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			
			 while(br.ready()) { System.out.println(br.readLine()); }
			
			
			// OR we can do this way
			//br.lines().forEach(str -> System.out.println(str));
			
			
			// OR we can do this way
			
			/*
			 * InputStream is = new FileInputStream(new File("test.txt")); int i=0; while((i
			 * = is.read()) != -1) { System.out.print((char)i); }
			 */
			
			
			br.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}
}
