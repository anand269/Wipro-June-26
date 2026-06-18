package javaprograms;

public class OperatorDemo {

	public static void main(String[] args) {
		// Pre and post Increment 
		int x = 5;

		++x; // Increment x by 1
		System.out.println(x); // 6 -> pre-increment
		System.out.println(x++); // 6 or 7 -> Post increment
		System.out.println(x);
		
		int y=10;
		System.out.println(y--); // 10 -> Post decrement
		System.out.println(--y); //8 -> pre decrement
	}

}
