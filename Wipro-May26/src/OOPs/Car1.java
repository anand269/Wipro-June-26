package OOPs;

public class Car1 extends Vehicle implements Test,Test2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c = new Car1();
		c.start();
		c.show();
		c.noShow();	
		c.circus();
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle started");
	}

	@Override
	public void noShow() {
		// TODO Auto-generated method stub
		System.out.println("Today no Broad way show ");
	}

	@Override
	public void circus() {
		// TODO Auto-generated method stub
		System.out.println("We are going to watch the circus");
	}

}
