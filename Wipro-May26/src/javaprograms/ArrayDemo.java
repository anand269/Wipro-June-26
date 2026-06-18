package javaprograms;

public class ArrayDemo {

	public static void main(String[] args) throws InterruptedException {
		// String Array 
		String [] countries= {"Brazil","Chille","Russia","India","Srilanka"};
		System.out.println(countries[3]);
		System.out.println(countries.length);

		/*
		 * //for each loop for(String country: countries) { System.out.println(country);
		 * }
		 */

		/*
		 * //for loop for(int n=0;n<countries.length;n++) {
		 * System.out.println(countries[n]); Thread.sleep(1000); }
		 */

		//for loop
		//int[] ia={12,34,546};
		//ia= {12,34,546};
		
		MathDemo md = new MathDemo();//md is an object, MathDemo -> class
		md.sum(1, 2);
	}

}
