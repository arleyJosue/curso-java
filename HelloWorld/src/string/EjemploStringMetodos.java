package string;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Josué";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase(() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Josué\") = " + nombre.equals("Josué"));
        System.out.println("nombre.equals(\"josué\") = " + nombre.equals("josué"));
        System.out.println("nombre.equalsIgnoreCase(\"joSué\") = " + nombre.equalsIgnoreCase("joSué"));

        // comparteTo siempre devuelve un integer
        // compara string con string de orden alfabético pero no del abecedario si no un orden lexicográfico basado en relación de orden definida sobre la tabla unicode
        // realiza comparación sobre el orden numérico de cada código que está en la tabla unicode comparando los caracteres y los va ordenando
        System.out.println("nombre.compareTo(\"Josué\") = " + nombre.compareTo("Josué")); // = 0
        System.out.println("nombre.compareTo(\"JosUé\") = " + nombre.compareTo("JosUé")); // = 32

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // J
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4)); // é
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(0) = " + nombre.substring(0)); // Josué
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // osué
        System.out.println("nombre.substring(2) = " + nombre.substring(2)); // sué

        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // osu
        
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \"o\") = " + trabalengua.replace("a", "o")); // trobolenguos
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf(\"a\") = " + trabalengua.indexOf("a")); // entrega la primera letra en la palabra  2
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a")); // 10
        System.out.println("trabalengua.indexOf(\"z\") = " + trabalengua.indexOf("z")); // -1
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t")); // lo contiene si o no 
        System.out.println("trabalengua.indexOf(\"lengua\") = " + trabalengua.indexOf("lengua")); // 5
        System.out.println("trabalengua.contains(\"lengua\") = " + trabalengua.contains("lengua")); // true
        System.out.println("trabalengua.startsWith(\"tr\") = " + trabalengua.startsWith("tr")); // true
        System.out.println("trabalengua.endsWith(\"uas\") = " + trabalengua.endsWith("uas")); // true
        System.out.println("   trabalenguas   ,");
        System.out.println("   trabalenguas enrredado   ".trim());
    }
}
