package javaprograms;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;//32 bit
		double myDouble =  myInt; // Automatic casting: int to double

		System.out.println(myInt);    // Outputs 9
		System.out.println(myDouble);
		
		int myInt2=(int) myDouble;//explicit casting
		System.out.println(myInt2);//9
	}

}
