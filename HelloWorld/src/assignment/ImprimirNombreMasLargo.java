package assignment;

public class ImprimirNombreMasLargo {
    public static void main(String[] args) {
        String nombreUno = "Arley Martínez";
        String nombreDos = "Carolina Valencia";
        String nombreTres = "Matias Martínez";

        String[] largoUno = nombreUno.split(" ");
        String[] largoDos = nombreDos.split(" ");
        String[] largoTres = nombreTres.split(" ");

        if (largoUno[0].length() > largoDos[0].length() && largoUno[0].length() > largoTres[0].length()){
            System.out.println(largoUno[0]);
        }
        if (largoDos[0].length() > largoUno[0].length() && largoDos[0].length() > largoTres[0].length()){
            System.out.println(largoDos[0]);
        }
        if (largoTres[0].length() > largoUno[0].length() && largoTres[0].length() > largoDos[0].length()){
            System.out.println(largoTres[0]);
        }

    }
}
