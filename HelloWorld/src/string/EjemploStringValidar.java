package string;

public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean isNull = curso == null;

        System.out.println("isNull = " + isNull);

        if (isNull) {
//            System.out.println(curso.toUpperCase());

            curso = " "; // ""; // "Programación Java";
        }

        boolean isEmpty = curso.length() == 0;

        System.out.println("isEmpty = " + isEmpty);

        boolean isEmpty2 = curso.isEmpty();
        System.out.println("isEmpty2 = " + isEmpty2);

        boolean isBlank = curso.isBlank();

//        if (!isEmpty){
//        if (!isEmpty2){
        if (isBlank){

//        System.out.println(curso.concat(" desde cero!")); // da error
        System.out.println("bienvenido al curso ".concat(curso)); // da error
            System.out.println(curso.toUpperCase());
//        System.out.println("bienvenido al curso " + curso ); // no da error
        }

    }
}
