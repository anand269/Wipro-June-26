package javaprograms;

public class VariableDemo {

	//Constructor -> to initialize the value
	int age=24; //instance variable
	//User defined method -> not returning anything
	static String company="Amagi";//static variable
	void display() //-> call this
	{
		int number=10;//local variable
		System.out.println(number);
	}
	
	void show()
	{
		System.out.println("My age is "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo vd= new VariableDemo();//object
		vd.display();
		vd.show();
		//show();
		System.out.println(company);
	}

}
