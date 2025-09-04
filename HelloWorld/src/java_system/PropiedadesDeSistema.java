package java_system;

import java.util.Properties;

public class PropiedadesDeSistema {
    public static void main(String[] args) {

//        Key	                Meaning
//        "file.separator"	    Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
//        "java.class.path"	    Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
//        "java.home"	        Installation directory for Java Runtime Environment (JRE)
//        "java.vendor"	        JRE vendor name
//        "java.vendor.url"	    JRE vendor URL
//        "java.version"	    JRE version number
//        "line.separator"	    Sequence used by operating system to separate lines in text files
//        "os.arch"	            Operating system architecture
//        "os.name"	            Operating system name
//        "os.version"	        Operating system version
//        "path.separator"	    Path separator character used in java.class.path
//        "user.dir"	        User working directory
//        "user.home"	        User home directory
//        "user.name"	        User account name

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator = " + lineSeparator);
        System.out.println("lineSeparator2 = " + lineSeparator2);


        Properties p = System.getProperties();
        p.list(System.out);
    }
}
