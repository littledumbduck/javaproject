package boletin_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        boolean loop = true;
        double num = 0;
        Scanner input = new Scanner(System.in);

        while(loop){
            try {
                System.out.print("Type number: ");
                num = input.nextDouble();
                loop = false;
            } catch(Exception e){
                System.out.println("Not a valid number");
                input.next();
            }
        }
        System.out.println("Number: " + num);
    }
}
