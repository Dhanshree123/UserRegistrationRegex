package GradleUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean email(String email) {
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern p3 = Pattern.compile(pattern_email);
		Matcher m3 = p3.matcher(email);
		return m3.matches();
	}

	
}
