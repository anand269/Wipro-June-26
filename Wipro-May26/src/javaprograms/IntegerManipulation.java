package javaprograms;

public class IntegerManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100, b=100;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		Integer x=128,y=128;
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		Integer num=-1;
		int val=num.intValue();
		System.out.println(val);
		
		char c1='A',c2='B',c3='C';//ASCII-> 65
		System.out.println(c1==c2);		
		String name=String.valueOf(c1);
		name=String.valueOf(c1);
		name=name+c2+c3;
		System.out.println(name+c2+c3);
		System.out.println(name.charAt(1));
	}
}
