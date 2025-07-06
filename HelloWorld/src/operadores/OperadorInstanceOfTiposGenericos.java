package operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        // String texto = "Objeto de clase String";

        Object texto = "Objeto de clase String";
        Integer num = 0;

        // si un objeto es un tipo de una clase
        // boolean b1 = texto instanceof String;
        boolean b1 = texto instanceof Integer;

        System.out.println("b1 = " + b1);
    }
}
