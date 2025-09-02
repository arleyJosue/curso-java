package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        System.out.println("calendario = " + calendario);

        calendario.set(2020,11, 25, 20, 10, 55);

        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

//        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd 'hora' hh:mm:ss:SS a");
        System.out.println("formato con formato = " + formato.format(fecha));
    }
}
