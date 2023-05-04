import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1083323_0421_1{
	public static void main(String[] args){
        System.out.println("plz enter your email address:");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        boolean isValidEmail = emailPattern.validate(email);
        System.out.println(isValidEmail);
	}
    public static class emailPattern {
        private static final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

        public static boolean validate(final String email) {
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
}

