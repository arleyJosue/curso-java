package string;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
              
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        // arreglos de elementos tipo char
        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println("\n");
        System.out.println("trabalengua = " + trabalengua.split("a"));
        
        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println("arreglo2[j] = " + arreglo2[j]);
        }

        String archivo = "alguna_imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // retorna un array separados por el \\.  [.] 
        l = archivoArr.length;
        for (int k = 0; k < l; k++) {
            System.out.println("archivoArr = " + archivoArr[k]);
        }

        System.out.println("archivoArr[l - 1] = " + archivoArr[l - 1]);
    }
}
