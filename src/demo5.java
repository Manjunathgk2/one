import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
public class demo5 {
    public static void main(String[] args) {
        //LocalDate d=LocalDate.of(2000, Month.FEBRUARY,29);
        //System.out.println(d);
        LocalTime t=LocalTime.now(ZoneId.of("Japan"));
       System.out.println(t);
    }
}
