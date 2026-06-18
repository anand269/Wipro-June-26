package javaprograms;

public class Demo1 {

	public static void main(String[] args) {
		/* My first program in Java which prints
		I am travelling */
		System.out.println("We are good on Friday");
		System.out.print("We are in the 2nd statement \n\t");
		//System.out.print("We are in the 3rd statement");
		System.out.println(3);
		final int myNum = 15;
	//	myNum = 20;  
		System.out.println(myNum);
		
		String firstName = "Wipro ";
		String lastName = "Technologies";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		int num1=12;
		int num2=34;
		System.out.println(num1+num2);
		
		int $_x1 = 5;
		int y = 6;

		//System.out.println("The sum is " + x + y);   // Prints: The sum is 56
		System.out.println("The sum is " + ($_x1 + y)); // Prints: The sum is 11
		float f=100.34f;//floating number with fractions
		System.out.println(f);
		double d = 234432.435;
		System.out.println(d);
		
		long myNum2 = 15000000000L;
		System.out.println(myNum2);
		
		boolean n1=true;
		System.out.println(!n1);
		
		final char myGrade = 'B';
	//	myGrade = 'b';
		System.out.println(myGrade);
		
		String greeting = "Hello World";
		System.out.println(greeting.length());
		System.out.println(greeting.charAt(10));
		
		String $_1name="Hello";//valid identifier
		System.out.println($_1name);
	}

}
