package javaprograms;
import javaprograms.MathDemo;

public class JavaDemo1 {
	static int num=10;//declaration
	//Constructor-> Initialize the value
	
	  public JavaDemo1() { 
		  num=56;//initialize }
	  }
	 
	  public JavaDemo1(int val1) { 
		  num=val1;//initialize }
	  }
	public static void main(String[] args) {
		// Comment -> Print a simple line
		System.out.println("We are new to Java");
		MathDemo md = new MathDemo();//md is an object, MathDemo -> class
		md.sum(1, 2);
		//System.out.println(num);//10
		JavaDemo1 jd1 = new JavaDemo1();//default is called
		System.out.println(jd1.num);
		JavaDemo1 jd2=new JavaDemo1(30);
		System.out.println(jd2.num);
	}

}
