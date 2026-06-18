package javaprograms;

public class SwitchDemo {

	public static void main(String[] args) {
		// Month with string (January)-> How will you perform
		int day = 10;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			//break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Default statement");

			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

			for (String car : cars) {
				System.out.print(car+"  ");
			}
			
			for (int i = 0; i < 10; i++) {
				  if (i == 4) {
				    break;
				  }
				  System.out.println(i);
				}

		}
	}

}
