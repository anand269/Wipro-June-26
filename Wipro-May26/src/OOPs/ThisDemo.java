package OOPs;

class Demo
{
	int i;    //instance variables
	void setValues(int i)
	{
		this.i=i;
	}
	void show()	 
	{
		System.out.println(i);		
	}
	int b;
	void m1()
	{
		b=20;  //error and not valid
	}

}
class ThisDemo
{
	public static void main(String[] args)
	{
		Demo t = new Demo();
		t.setValues(10);
		t.show();
	}
}
