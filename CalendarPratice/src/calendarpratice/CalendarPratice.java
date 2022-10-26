
package calendarpratice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPratice {

    public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
       cal.add(Calendar.DATE, 1);
       System.out.println(cal.getTime());
       String format1 = (new SimpleDateFormat("dd-MM-yy").format(cal.getTime()));
       System.out.println(format1);
       
    }
    
}
