import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
public class TestNIOClasses {

	public static void main(String[] args) {
	try {
		Path p = Paths.get("empcsv.csv");
		List<String> lst = Files.readAllLines(p);
		for(String s: lst) {
			String[] str = s.split(",");
			System.out.println(str[0] +  "------" + str[1] + "------" + str[2]);
		}
	
	 
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error in reading");
	}}
	}

