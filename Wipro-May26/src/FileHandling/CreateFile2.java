package FileHandling;

import java.io.File;       // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // Import IOException to handle errors
import java.util.Scanner;

public class CreateFile2 {
	public static void main(String[] args) throws IOException,IndexOutOfBoundsException{

		File myObj = new File("D:/files/Wiprofile2.txt"); // Create File object
		if (myObj.createNewFile()) {           // Try to create the file
			System.out.println("File created: " + myObj.getName());
		} else {
			System.out.println("File already exists.");
		}  

		/*
		 * try { FileWriter myWriter = new FileWriter("D:/files/Wiprofile2.txt");
		 * myWriter.write("Files in Java might be tricky, but it is fun enough!");
		 * myWriter.close(); // must close manually
		 * System.out.println("Successfully wrote to the file."); } catch (IOException
		 * e) { System.out.println("An error occurred."); e.printStackTrace(); }
		 */

		// try-with-resources: Scanner will be closed automatically
		try (Scanner myReader = new Scanner(myObj)) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
