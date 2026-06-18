import java.io.IOException;

import javaprograms.MathDemo;

public class JavaDemo1 {

	public static void main(String[] args) { //throws ArithmeticException,IOException{
		// Comment -> Print a simple line
		System.out.println("We are new to Java");
		MathDemo md = new MathDemo();//md is an object, MathDemo -> class
		//md.sum(1, 2);
		
	//	int i = 10/0;
	//	System.out.println(i);
		checkAge(18);
	}
	
	 static void checkAge(int age) {
	        
	        if (age < 18) {
	            throw new IllegalArgumentException("Age must be 18 or above");
	        }
	        else
	        	System.out.println("18 and above can drive");
	    }

	 
}
