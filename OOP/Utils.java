import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

class Utils {

    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    static Date convertDate(String input) throws ParseException {
        return formatter.parse(input);
    }

    /**
     * Return the date in the form of string.
     */

    static String formattedDate(Date date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
