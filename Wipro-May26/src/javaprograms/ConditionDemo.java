package javaprograms;

public class ConditionDemo {

	public static void main(String[] args) throws InterruptedException {
		// for loop and while demo
		for(int i=0;i<=10;i++)//for loop syntax
		{
			System.out.println(i);
			Thread.sleep(500);//milliseconds-> 1 sec
		}
		
		int i=10;
		while(i>0)//while loop
		{
			System.out.println(i);
			i--;
			Thread.sleep(1000);
		}
		//if condition
		int age=17;
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else if (age<16)
			System.out.println("You are not eligible");
	}

}
