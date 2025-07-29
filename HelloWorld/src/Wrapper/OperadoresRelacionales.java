package Wrapper;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo ibjero? " + (num1 == num2)); // true

        num2 = 1000;
        System.out.println("Son el mismo ibjero? " + (num1 == num2)); // false

//        cuando son wrapper - objetos compara por instancia

//        comparar por valor metodo equals
        System.out.println("Son el mismo ibjero? " + (num1.equals(num2))); // true

        System.out.println("Son el mismo ibjero? " + (num1.intValue() == num2.intValue())); // true



//        esto se aplica a número mayores o igual a 128
//        java hasta 127  compara por valor
//        si es mayor o igual siempre compara por instancia



        num1 = 1000;
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion);

    }
}
