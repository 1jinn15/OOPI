import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A1083323_0421_2{
	public static void main(String[] args){
        System.out.println("plz enter a date(yyyy/mm/dd)or(mm/dd/yyyy):");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        boolean isValidEmail = datePattern.validate(date);
        System.out.println(isValidEmail);
	}
    public static class datePattern {
        private static final String DATE_FORMAT1 = "yyyy/MM/dd";
        private static final String DATE_FORMAT2 = "MM/dd/yyyy";

        public static boolean validate(final String date) {
            SimpleDateFormat sdf1 = new SimpleDateFormat(DATE_FORMAT1);
            SimpleDateFormat sdf2 = new SimpleDateFormat(DATE_FORMAT2);
            sdf1.setLenient(false);
            sdf2.setLenient(false);

            try {
                Date parsedDate = sdf1.parse(date);
                return true;
            } catch (ParseException e) {
                try{
                    Date parsedDate = sdf2.parse(date);
                    return true;
                }catch(ParseException e1){
                    return false;
                }
            }
        }
    }
}

