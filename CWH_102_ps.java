import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CWH_102_ps {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("Student 1");
        // list.add("Student 2");
        // list.add("Student 3");
        // list.add("Student 4");
        // list.add("Student 5");
        // list.add("Student 6");
        // list.add("Student 7");
        // list.add("Student 8");
        // list.add("Student 9");
        // list.add("Student 10");
        // for (Object idx : list) {
        //     System.out.println(idx);
        // }

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String myTime = ldt.format(dtf);
        System.out.println(myTime);
    }
}
