package javaprograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		System.out.println(txt.length()); 
		System.out.println(txt.compareTo("Real Hero")); 
		System.out.println(txt.contains("wor"));
		System.out.println(txt.equals("Hello World"));
		System.out.println(txt.equalsIgnoreCase("hello world"));
	}

}
