
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main block executed");
	} 
	static int companyCode;
	static int rollNo;
	static 
	{
		rollNo=1;
		System.out.println("Second block "+rollNo);
	}
	
	static 
	{
		companyCode=10;
		System.out.println("Static block executed "+companyCode);
	}
	
	

}
