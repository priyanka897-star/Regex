package validation;

import java.util.regex.*;

public class UserRegistration {

	public static void userValidation() {
		final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		boolean result1 = Pattern.matches(EMAIL, "abc@yahoo.com");
		System.out.println("abc@yahoo.com" + ":" + result1);

		boolean result2 = Pattern.matches(EMAIL, "abc-100@yahoo.com");
		System.out.println("abc-100@yahoo.com" + ":" + result2);

		boolean result3 = Pattern.matches(EMAIL, "abc.100@yahoo.com");
		System.out.println("abc.100@yahoo.com" + ":" + result3);

		boolean result4 = Pattern.matches(EMAIL, "abc111@abc.com");
		System.out.println("abc111@abc.com" + ":" + result4);

		boolean result5 = Pattern.matches(EMAIL, "abc-100@abc.net");
		System.out.println("abc-100@abc.net" + ":" + result5);

		boolean result6 = Pattern.matches(EMAIL, "abc.100@abc.com.au");
		System.out.println("abc.100@abc.com.au" + ":" + result6);

		boolean result7 = Pattern.matches(EMAIL, "abc");
		System.out.println("abc" + ":" + result7);

		boolean result8 = Pattern.matches(EMAIL, "abc@%*.com");
		System.out.println("abc@%*.com" + ":" + result8);

		boolean result9 = Pattern.matches(EMAIL, "abc()*@gmail.com");
		System.out.println("abc()*@gmail.com" + ":" + result9);

		boolean result10 = Pattern.matches(EMAIL, "abc@abc@gmail.com");
		System.out.println("abc@abc@gmail.com" + ":" + result10);

		boolean result11 = Pattern.matches(EMAIL, "abc@gmail.com.au");
		System.out.println("abc@gmail.com.au" + ":" + result11);

		boolean result12 = Pattern.matches(EMAIL, "abc()*@gmail.com");
		System.out.println("abc()*@gmail.com" + ":" + result6);
	}

	public static void main(String[] args) {
		userValidation();
	}
}
