package OOPs;

abstract class common
{
	abstract void accept( ); // abstract method
	abstract void display( ); // abstract method
	void f1( ) // non abstract method
	{
		System.out.println("HI");
	}
	void f2( ) // non abstract method
	{}
}
class student extends common implements Test
{
	void accept( )
	{
		System.out.println("Hello");
	}
	void display( )
	{
	}
	
	@Override
	public void noShow() {
		// TODO Auto-generated method stub
		System.out.println("Today there is no movie show");
	}
}
class Abstract_abstmeth_nonabstmeth
{
	public static void main(String args[])
	{
		common r;
		r = new student();
		r.accept(); // calls student accept( );		
		r.f1( ); // calls non-abstract method f1( ) from the common class
		student s = new student();
		s.noShow();
	}
}
