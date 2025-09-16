package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato \"2025-01-25\"");
        try {
//            Date fecha = format.parse("2025-01-25");
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));


//            comparar fecha
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)) {
                System.out.println("fecha del usuario es después o mayor que fecha2");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha del usuario es anterior o menor que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha del usuario es igual que fecha2");
            }
//            compareTo
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("fecha del usuario es después o mayor que fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha del usuario es anterior o menor que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha del usuario es igual que fecha2");
            }

            } catch(ParseException e){
                throw new RuntimeException(e);
            }
    }
}
