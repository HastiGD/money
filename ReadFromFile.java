package lab4;
import java.io.File; 
import java.util.Scanner; 

/* The ReadFromFile class is an extension for the driver of the Money class. It will allow a user
 * to read Money value from a text file which would specify dollars and cents. ReadFromFile 
 * is given a file path, and it reads the file line by line, and generates Money objects.
 * It could be referred to as a sort of factory object. The point of this class is to 
 * make the money driver so versatile that different users don't have to touch the code
 * to make their own objects, preserving the integrity of the driver code.
 */

public class ReadFromFile {
	static Scanner sc;
	
	public ReadFromFile(File filepath) throws Exception {
		// pass the path to the constructor as a parameter
		sc = new Scanner(filepath);
	}
	
	public Money readLines() {
		// read file line by line
    	int Dollars = sc.nextInt();
	    int Cents = sc.nextInt();
	    System.out.println(Dollars);
	    System.out.println(Cents);
	    // create a new Money object from the values in file
	    Money m1 = new Money(Dollars, Cents);
	    System.out.println(m1);
		return m1;
	}
	
	public static void main(String[] args) throws Exception {
		File file = 
				new File("/Users/hastigheibidehnashi/eclipse-workspace/lab4/src/lab4/MoneyVals.txt");
		ReadFromFile rf = new ReadFromFile(file);
		
		// create the Money objects
	    while(sc.hasNextLine()) {
	    	// call readLines()
	    	rf.readLines();
	    }
	}
}
