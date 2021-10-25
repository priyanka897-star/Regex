package validation;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	public String userFirstName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		return firstName;
	}

	public String userLastName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		return lastName;
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		final String FIRSTNAME = "(^[A-Z]{1}[a-zA-Z]{3,}$)";
		final String LASTNAME = "(^[A-Z]{1}[a-zA-Z]{3,}$)";
		boolean resultForFirstName = Pattern.matches(FIRSTNAME, userRegistration.userFirstName());
		System.out.println(resultForFirstName);
		if (resultForFirstName == false) {
			System.out.println("Enter valid First Name");
		}
		boolean resultForLastName = Pattern.matches(LASTNAME, userRegistration.userLastName());
		System.out.println(resultForLastName);
		if (resultForLastName == false) {
			System.out.println("Enter valid Last Name");
		}
	}
}
