import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String myDate = ldt.format(dtf);
        System.out.println(myDate);
    }
}
