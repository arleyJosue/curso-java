package string;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Josué Martínez";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int a = 10;
        int b = 5;

        System.out.println(detalle + a + b); // concatena ya que lo primero es un string
//        System.out.println(detalle + (a + b));

        System.out.println(a + b + detalle); // suma y luego concatena ya que se encuentra un int
//        System.out.println((a + b) + detalle);

//        .concat() es mas eficiente que el +  -> cada que se concatena con + se crea una instancia de stream builder
//        String detalle2 = curso.concat(profesor);
//        String detalle2 = curso.concat(" con ".concat(profesor));
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
