package javaprograms;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-100));
		System.out.println(Math.ceil(12.234));
		System.out.println(Math.floor(12.234));
		System.out.println(Math.PI);

		//Object
		MathDemo md = new MathDemo();
		md.sum();		
		md.sum(12,345);
		add();
	}

	//User defined method
	public static void sum() //no parameters
	{
		int num1=123;
		int num2=345;
		int sum=num1+num2;
		System.out.println("Sum of "+num1+" & "+num2+" is: "+sum);
	}

	//User defined method
	static void sum(int n1,int n2)//method with arguments
	{
		//int num1=123;
		//int num2=345;
		int sum=n1+n2;
		System.out.println("Sum of "+n1+" & "+n2+" is: "+sum);
	}

	//User defined method
	public static int add() //no parameters
	{
		int num1=34;
		int num2=32;
		int addition=num1+num2;
		System.out.println("Sum of "+num1+" & "+num2+" is: "+addition);
		return addition;//last statement	
	}

}
