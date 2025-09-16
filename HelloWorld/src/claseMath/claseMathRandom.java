package claseMath;

import java.util.Random;

public class claseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};


        double random = Math.random();
//        numero random entre 0 y 1
//        nunca es 1
        System.out.println("random = " + random);
        
        random *= colores.length;
//        random *= 7;
        System.out.println("random = " + random);
        
        random = Math.floor(random);

        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int) random]);

//        no se incluye los números límites
        Random randomObj = new Random();
//        int randomInt = randomObj.nextInt();
//        int randomInt = randomObj.nextInt(7, 25);
        int randomInt = randomObj.nextInt(7);
//        long randomInt = randomObj.nextLong();

        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}

