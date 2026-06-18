package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDetails {

	public static void main(String args[])
	{
		File myObj = new File("D:/files/Wiprofile2.txt"); // Create File object
		System.out.println("File created : "+myObj.getParentFile());
		System.out.println("Path of the file : "+myObj.getAbsolutePath());
		System.out.println("Can write : "+myObj.canWrite());
		System.out.println("Length of the file : "+myObj.length());
		
		String name;
		System.out.println("Please type your name and press enter");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			name = reader.readLine();
			System.out.println("Hello, "+name);
		}
		catch(IOException e)
		{
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
		
	}
}
