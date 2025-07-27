package flujosDeControl;

public class SwitchCase {
    public static void main(String[] args) {

        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            default:
                System.out.println("No existe");

        }

        String user = "admin";

        switch (user) {
            case "admin":
                System.out.println("Bienvenido administrador");
                break;
            case "editor":
                System.out.println("Bienvenido editor");
                break;
            case "arley":
                System.out.println("Bienvenido arley");
                break;
            default:
                System.out.println("No existe el usuario");

        }


        int mes = 12;

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No coincide el mes");

        }
    }
}
