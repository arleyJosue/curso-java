public class ConversionDeTipos {
    public static void main(String[] args) {

//        String a primitivo
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);

        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9876.54e-3";
        double realDouble = Double.parseDouble(realStr);

        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        
        
//        Primitivo a String
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroNumeroDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroNumeroDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);



//        Primitivos a Primitivos
        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        
    }
}
