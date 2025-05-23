package primitivos;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
//        en windows se escribe mapa de caracteres para ver los caracteres
//        char caracter = 'a';
        char caracter = '\u0040';// caracter unicode @
        System.out.println("caracter = " + caracter);
        
        char decimal = 64; //@
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        imprimirDatosCharacter("char", Character.BYTES, Character.SIZE, Character.MAX_VALUE, Character.MIN_VALUE);

//        char espacio = ' ';
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
    }
    public static void imprimirDatosCharacter( String tipoDato, int bytesType, int sizeType, int maxValue, int minValue){
        System.out.println(" ");

        System.out.println("tipo " + tipoDato + " correspone en byte a " + bytesType);
        System.out.println("tipo " + tipoDato + " correspone en bites a " + sizeType);
        System.out.println("valor máximo de un " + tipoDato + " " + maxValue);
        System.out.println("valor mínimo de un " + tipoDato + " " + minValue);

        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println(" ");

    }
}
