package validation;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	 
	public static  void userValidation() {
		 Scanner scanner = new Scanner(System.in);
		  boolean check = true;
	    while (check) {
		  System.out.println("Enter Your option to validate\n  1.FirstName\n ");
		  int option = scanner.nextInt();
		  scanner.nextLine();
		  switch (option) {
		  case 1:
			final String REGEX_FIRSTNAME = "([A-Z]{1}[a-zA-Z]{3,})";
			System.out.println("Enter First name :");
			String firstName = scanner.next();
		        boolean  resultForFirstName = Pattern.matches(REGEX_FIRSTNAME, firstName);
		        System.out.println(resultForFirstName);
		        if(resultForFirstName == false) {
		    	   System.out.println("Enter valid First Name");
			break;
		    }
		  default:
			 check = false;
				break;
		}
	}
}
	public static void main(String[] args) {
		UserRegistration.userValidation();
	}
}	
	
		
	

	


	
	
	
