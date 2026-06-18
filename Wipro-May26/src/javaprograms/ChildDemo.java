package javaprograms;

public class ChildDemo extends MathDemo{

	public static void main(String[] args) {
		// MathDemo-> Parent & ChildDemo-> Child class
		sum(30,20);
		MathDemo md1= new MathDemo();
		sum();
	}
	
	/*
	 * public static void sum() { System.out.println("Override demo");
	 * 
	 * }
	 */
	

}
