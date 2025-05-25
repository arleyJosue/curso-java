package operadores;

import javax.swing.*;

public class OperadoresArtmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j; // UN OPERADOR SIEMPRE SE USA ENTRE DOS VARIABLES O LITERALES

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j); // i + j = 54
        System.out.println( i + j + " i + j"); // 9 i + j
        
        int resta = i - j;
        System.out.println("resta = " + resta); // resta = 1
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);

        float div = (float )i / (float )j;
        System.out.println("div = " + div);
        
        int resto = i % j;

        resto = 21 % 2;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else  {
            System.out.println("numero impar = " + numero);

        }

    }
}
