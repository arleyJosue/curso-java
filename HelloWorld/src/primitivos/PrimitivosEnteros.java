package primitivos;

public class PrimitivosEnteros {
    public static void main(String[] args) {

//      máximo valor soporta -128  127
        byte numeroByte = 127;

        System.out.println("numeroByte 8 bits = " + numeroByte);
        imprimirDatos("byte", Byte.BYTES, Byte.SIZE, Byte.MAX_VALUE, Byte.MIN_VALUE);

//        valor máximo de un Short -32768  32767
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        imprimirDatos("short", Short.BYTES, Short.SIZE, Short.MAX_VALUE, Short.MIN_VALUE);

//        valor máximo de un int -2147483648  2147483647
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        imprimirDatos("int", Integer.BYTES, Integer.SIZE, Integer.MAX_VALUE, Integer.MIN_VALUE);


//        valor máximo de un long -9223372036854775808  9223372036854775807
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        imprimirDatos("long", Long.BYTES, Long.SIZE, Long.MAX_VALUE, Long.MIN_VALUE);

        var numeroVar = 127;
    }
    public static void imprimirDatos( String tipoDato, long bytesType, long sizeType, long maxValue, long minValue){
        System.out.println(" ");

        System.out.println("tipo " + tipoDato + " correspone en byte a " + bytesType);
        System.out.println("tipo " + tipoDato + " correspone en bits a " + sizeType);
        System.out.println("valor máximo de un " + tipoDato + " " + maxValue);
        System.out.println("valor mínimo de un " + tipoDato + " " + minValue);

        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println(" ");
    }


}

