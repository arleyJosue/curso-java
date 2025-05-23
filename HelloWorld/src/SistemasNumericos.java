import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroEntrada = JOptionPane.showInputDialog(null, "Convierta un número entero a Binario - Octal y Hexadecimal \n Ingrese el número");

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroEntrada) ;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error! Debe ingresar un número entero");
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

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
