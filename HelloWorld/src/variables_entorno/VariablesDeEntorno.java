package variables_entorno;

import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
//        iterar varEnv

        System.out.println("------- Listando variables de entorno del sistema -------");
        for(String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }



        System.out.println("Variable de ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

//     por comando en terminal se puede agregar variables de entorno
//        setx SALUDAR_HOLA "Hola amigos"


    }
}
