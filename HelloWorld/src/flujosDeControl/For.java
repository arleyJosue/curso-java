package flujosDeControl;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++){
            System.out.println("i = " + i);
        }

//        String nombre[] = {"arley", "josue", "carolina"};
        String[] nombre = {"arley", "josue", "carolina"};
        int count =  nombre.length;
        for (int i = 0; i < count; i++){
            System.out.println("nombre = " + nombre[i]);
        }
    }
}
