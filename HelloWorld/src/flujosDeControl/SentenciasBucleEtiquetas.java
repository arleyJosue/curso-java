package flujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

    // identificador de un bucle

        bucle: for(int i = 0; i <= 7; i++) {
            System.out.println();
            for(int j = 0; j <= 7; j++) {
                if(i== 6 || i == 7){
                    System.out.println("Dia " + i + ": descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + (i + 1) + ": trabajando a las " + (j+1) + " hrs");
            }
        }

        System.out.println("\n================================================");

        bucle1: for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5; j++) {
                if(i==2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "],  ");
            }
        }

        System.out.println("\n================================================");
        bucle2: for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5; j++) {
                if(i==2){
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "],  ");
            }
        }
    }
}
