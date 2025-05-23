import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Convierta un número entero a Binario - Octal y Hexadecimal \n Ingrese el número");
        String numeroEntrada = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroEntrada) ;
//        } catch (NumberFormatException e) {
        } catch (Exception e) {
            System.out.println("Error! Debe ingresar un número entero  Message: " + e + "\n");
//            JOptionPane.showMessageDialog(null, "Error! Debe ingresar un número entero");
            main(args);
//            return;
            System.exit(0); // 0 tod0 salió bien
        }

        String mensajeBinario = "número binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "número octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "número hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario + "\n";
        mensaje += mensajeOctal + "\n";
        mensaje += mensajeHexadecimal + "\n";

        System.out.println(mensaje + "\n");
//        JOptionPane.showMessageDialog(null, mensaje);
    }
}
