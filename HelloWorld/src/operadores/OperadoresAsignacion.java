package operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;  // asigna un valor a una variable '=' el signo de igual
        int j = 6;
        // operadores convinados o compuestos
        i = i + 2;
        i += 2;
        System.out.println("i = " + i);
        
        j -=4;
        System.out.println("j = " + j);
        
        j *= 3;
        System.out.println("j = " + j);
        
        String sqlString = "select * from clientes as c";
        
        sqlString += " where c.nombre='Josue'";
        sqlString += " and c.activo=1";

        System.out.println("sqlString = " + sqlString);
    }
}
