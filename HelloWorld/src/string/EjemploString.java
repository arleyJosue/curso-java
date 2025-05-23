package string;

public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean esIgual = curso == curso2; // comparación por referencia
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2); // comparación por valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        // es igual ya que cuando se crean de manera literal (sin el new ) un string con el mismo valor no se crea un nuevo objeto o nueva instancia, para optimizar se asigna la referencia del objeto que ya existe

        System.out.println("curso == curso3 = " + esIgual);
    }
}
