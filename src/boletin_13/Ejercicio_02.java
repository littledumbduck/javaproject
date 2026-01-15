package boletin_13;

import java.nio.channels.ScatteringByteChannel;
import java.util.Random;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) % 2;

        System.out.println("Numero: " + num);

        try {
            if(num == 0){
                throw new Exception("El número es par");
            } else if (num == 1){
                throw new Exception("El número es impar");
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }
}
