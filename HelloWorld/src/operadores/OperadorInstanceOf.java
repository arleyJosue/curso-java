package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Objeto de clase String";
        Integer num = 0;
        
        // si un objeto es un tipo de una clase
        boolean b1 = texto instanceof String;

        System.out.println("b1 = " + b1);
    }
}
