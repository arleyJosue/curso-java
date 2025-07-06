package assignment;

import java.util.Random;
import java.util.Scanner;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {
        // Estanque lleno           = 70 litros
        // Estanque casi lleno      entre 60 y < 70 litros
        // Estanque 3/4             entre 40 y < 60 litros
        // Medio Estanque           entre 35 y < 40 litros
        // Suficiente               entre 20 y < 35 litros
        // Insuficiente             entre 1  y < 20 litros


        int litros = new Random().nextInt(1, 71);

        if (litros == 70){
            System.out.println(litros + " litros = Estanque lleno");
        } else if (litros >= 60 & litros < 70) {
            System.out.println(litros + " litros = Estanque casi lleno");
        } else if (litros >= 40 & litros < 60) {
            System.out.println(litros + " litros = Estanque 3/4");
        } else if (litros >= 35 & litros < 40) {
            System.out.println(litros + " litros = Medio Estanque");
        } else if (litros >= 20 & litros < 35) {
            System.out.println(litros + " litros = Suficiente");
        } else if (litros >= 1 & litros < 20) {
            System.out.println(litros + " litros = Suficiente");
        }
    }
}
