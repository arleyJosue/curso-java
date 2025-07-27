package flujosDeControl;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba) {
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        prueba = false;
        do {
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
