package ValorVsReferencia;

public class Referencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("iniciamos main");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad["+i+"] = " + edad[i]);
        }

        System.out.println("antes de llamar metodo test()");
        test(edad);
        System.out.println("despues de llamar metodo test()");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad["+i+"] = " + edad[i]);
        }
        System.out.println("finaliza main con datos modificados");
    }

    public static void test(int[] edadArr) {
        System.out.println("iniciamos metodo test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
            System.out.println("edad["+i+"] = " + edadArr[i]);
        }
        System.out.println("finaliza metodo test");
    }
}
