package ValorVsReferencia;

public class Valor {
    public static void main(String[] args) {

//  variables primitivas se pasa por valor

//        Integer i = 10;  las clases son inmutables, crea una nueva instancia
        int i = 10;
        System.out.println("iniciamos main con i = " + i);
        test(i);
        System.out.println("finaliza main con i = " + i);
    }

//    public static void test(Integer i) {
    public static void test(int i) {
        System.out.println("iniciamos metodo test con i = " + i);
        i = 35;
        System.out.println("finaliza metodo test con i = " + i);
    }

//    iniciamos main con i = 10
//    iniciamos metodo test con i = 10
//    finaliza metodo test con i = 35
//    finaliza main con i = 10
}
