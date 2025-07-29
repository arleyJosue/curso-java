package Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 123;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto1 = Integer.valueOf(123);
        Integer intObjeto2 = 123;

        System.out.println("intObjeto = " + intObjeto);

//        implicita
        int num = intObjeto2;
        System.out.println("num = " + num);

//        explicita
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

//        convertir un valor de strin a int
        String tv = "5500";
        int valor = Integer.valueOf(tv);

        Short shor = 32767;
        shor = intObjeto.shortValue();

//        perdida de informacióon
        Byte byteObjeto = intObjeto.byteValue();

        Long longObjeto = intObjeto.longValue();
    }
}
