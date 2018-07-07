import java.time.LocalDate;
import java.io.*;

public class Solution {

    public static String getDay(String day, String month, String year) {
        /*
        parseInt() method converts string to integer
        */
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);
        int yy = Integer.parseInt(year);
        LocalDate dt = LocalDate.of(yy, mm, dd); // creating a LocalDate object of the input date
        return ""+dt.getDayOfWeek();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}