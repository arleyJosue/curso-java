package operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {


        // String[] usernames = new String[2];
        // String[] passwords = new String[2];

        // usernames[0] = "josue";
        // passwords[0] = "123";

        // usernames[1] = "arley";
        // passwords[1] = "123";

        String[] usernames = {"josue", "arley"};
        String[] passwords = {"123", "456"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String u = sc.next();
        System.out.println("Ingrese la contraseña");
        String c = sc.next();

        boolean isAutentic = false;

        for (int i = 0; i < usernames.length; i++) {

            if(usernames[i].equals(u) && passwords[i].equals(c)) {
                System.out.println("es autentoico");
                break;
            } else {
                System.out.println("usuario o contraseña incorrecto");
            }

        }
    }
}
