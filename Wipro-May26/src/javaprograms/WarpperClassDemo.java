package javaprograms;

public class WarpperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String price = "500";//->int data type
		System.out.println(price+1);
		int value1=Integer.parseInt(price);
		System.out.println(value1+1);
		double d = Double.parseDouble(price);
		System.out.println(d+10.5);
		System.out.println(Integer.max(value1, 200));
		
		int petrol=102;
		Integer obj1= Integer.valueOf(petrol);//value into wrapper obj
		int num = obj1.intValue();//object to data type
	}

}
