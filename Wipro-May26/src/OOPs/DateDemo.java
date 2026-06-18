package OOPs;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	  public static void main(String[] args) {
	    LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    LocalDateTime myObj2 = LocalDateTime.now();
	    System.out.println(myObj2);
	  }
	}