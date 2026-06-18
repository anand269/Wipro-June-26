package javaprograms;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("My name is : "+name);
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Your age is "+age);
		
	}

}
