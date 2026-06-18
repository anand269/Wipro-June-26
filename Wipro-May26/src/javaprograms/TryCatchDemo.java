package javaprograms;

public class TryCatchDemo {

	public static void main(String[] args) {
		// Try/catch block in Java Demo
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[3]);
		} 
		catch (Exception e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();//prints error message
		}
		finally
		{
			System.out.println("We are in finally block");
		}
	}

}
