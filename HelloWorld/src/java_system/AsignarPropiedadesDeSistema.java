package java_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {
//        se agrega archivo en raiz src
//        config.properties

//        leer el archivo

        try {
            FileInputStream archivo = new FileInputStream("HelloWorld/src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado");

            System.setProperties(p);

//            System.getProperties().list(System.out);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("puerto: " +  System.getProperty("config.puerto.servidor"));
            System.out.println("otra: " +  System.getProperty("otra"));
            System.out.println("config.autor.nombre: " +  System.getProperty("config.autor.nombre"));

            ps.list(System.out);
        } catch (Exception e) {
//        } catch (FileNotFoundException e) {
            System.out.println("no existe el archivo = " + e);
//            throw new RuntimeException(e);
        }

    }
}
