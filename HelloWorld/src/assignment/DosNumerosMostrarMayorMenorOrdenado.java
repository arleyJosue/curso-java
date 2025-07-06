package assignment;

import java.util.Scanner;

public class DosNumerosMostrarMayorMenorOrdenado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número uno");
        int numeroUno = sc.nextInt();
        System.out.println("Ingrese número dos");
        int numeroDos = sc.nextInt();

        if (numeroUno > numeroDos) {
            System.out.println(numeroUno + " " + numeroDos);
        } else {
            System.out.println(numeroDos + " " + numeroUno);

        }

        String resultado = (numeroUno > numeroDos) ? numeroUno + ", " + numeroDos : numeroDos + ", " + numeroUno ;

        System.out.println("resultado = " + resultado);
    }
}
