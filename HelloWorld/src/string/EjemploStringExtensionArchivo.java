package string;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpg";
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length() -4) = " + archivo.substring(archivo.length() -4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));



    }
}
