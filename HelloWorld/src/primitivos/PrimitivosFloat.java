package primitivos;

public class PrimitivosFloat {
    public static void main(String[] args) {
        
//        float real = 2.12e3f; //2120f;
//        float real = 2.5e4f; //15000.0f;
        float real = 1.5e-10f; //0.00000000015f;
//        float real = 0.00000000015f; //1.5e-10f;
        System.out.println("real = " + real);
        imprimirDatosFloat("float", Float.BYTES, Float.SIZE, Float.MAX_VALUE, Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("real2 = " + realDouble);
        imprimirDatosDouble("double", Double.BYTES, Double.SIZE, Double.MAX_VALUE, Double.MIN_VALUE);


    }

    public static void imprimirDatosFloat( String tipoDato, float bytesType, float sizeType, float maxValue, float minValue){
        System.out.println(" ");

        System.out.println("tipo " + tipoDato + " correspone en byte a " + bytesType);
        System.out.println("tipo " + tipoDato + " correspone en bites a " + sizeType);
        System.out.println("valor máximo de un " + tipoDato + " " + maxValue);
        System.out.println("valor mínimo de un " + tipoDato + " " + minValue);

        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println(" ");

    }
    public static void imprimirDatosDouble( String tipoDato, double bytesType, double sizeType, double maxValue, double minValue){
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
