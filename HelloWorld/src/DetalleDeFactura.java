import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de la factura");
        String name = scanner.nextLine();
        
        System.out.println("Ingrese el precio 1");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio 2");
        double precio2 = scanner.nextDouble();

        double montoTotalBruto = precio1 + precio2;
        double impuesto = montoTotalBruto * 0.19;
        double totalNeto = montoTotalBruto + impuesto;

        System.out.println("Factura de " + name + " tiene un total de: " + montoTotalBruto + ", con un impuesto del 19% con un valor de: " + impuesto + ", y el total con impuesto es: " + totalNeto);

    }
}
