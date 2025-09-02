package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

//        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-YYYY");
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-YYYY");
//        SimpleDateFormat df = new SimpleDateFormat("yyy.MM.dd G 'Hora' HH:mm:ss z");
        SimpleDateFormat df = new SimpleDateFormat("E dd 'de' MMMM, yyyy");

        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);



        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);


//        calcular cuanto tiempo se demora en hacer un calculo
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() -  fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);
    }
}

// documentación- en google poner   simpledateformat java 8
// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html