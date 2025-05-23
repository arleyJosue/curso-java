package string;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // es mutable


        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
//            c = c.concat(a).concat(b).concat("\n"); // 1000 => 6 - 7 ms
//            c += a + b + "\n"; // 1000 => 24 - 28 ms
            sb.append(a).append(b).append("\n"); // 1000 => 0 - 1 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println((fin - inicio) + " ms");
//        System.out.println("c = " + c);
//        System.out.println("sb = " + sb.toString());
    }
}
