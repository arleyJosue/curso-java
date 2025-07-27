package flujosDeControl;

public class ForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1,3,5,7,9};
        for (int num: numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"arley", "josue", "carolina"};
        for(String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
