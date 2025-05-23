public class HolaMundo {
    public static void main(String[] args) {
        String saludo = "Hola Mundo desde JAVA";
        System.out.println(saludo);

        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        int numero = 10; //32 bites

        boolean valor = true;

        int numero2 = 5;
        if (valor) {
            System.out.println("numero 1 = " + numero);
            numero2 = 10;
        }
        System.out.println("numero 2 = " + numero2);

        var numero3 = 12;

        String nombre = "";

        nombre = "Josué";

        if (numero > 10) {
            nombre = "Arley";
        }

        System.out.println("nombre = " + nombre);
    }
}
