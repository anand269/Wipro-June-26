package OOPs;

public class ExceptionDemo {

	public static void main(String[] args) {
		// 1st try-catch block
		try {
			int[] numbers = {1, 2, 3};		 
			System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
			// ArithmeticException
		} 
		/*
		 * catch (ArithmeticException e) { System.out.println("Cannot divide by zero.");
		 * e.printStackTrace(); }
		 */		 	
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index does not exist.");
		}
		catch (Exception e) {
			System.out.println("Something else went wrong.");
		}
		finally
		{
			System.out.println("We are here finally");
		}

		//2nd try-catch block

		try {			
			int result = 10 / 0;   
		} 
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
			e.printStackTrace();
		}	
	}

}
