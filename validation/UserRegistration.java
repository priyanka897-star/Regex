package validation;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
		public String inputString() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter First Name");
			String firstName = scanner.next();
			return firstName;
		}
		public static void main(String[] args) {
			UserRegistration userRegistration = new  UserRegistration();
			final String FIRSTNAME = "(^[A-Z]{1}[a-zA-Z]{3,}$)";
			boolean result = Pattern.matches(FIRSTNAME, userRegistration.inputString()) ;
			System.out.println(result);
			if(result == false) {
				System.out.println("Enter valid First Name");
			}
		}
	}

