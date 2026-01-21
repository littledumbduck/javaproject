package boletin_13;

import java.util.Scanner;

public class Maincito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your age: ");

        int age = input.nextInt();
        try {
            AgeValidator.ageValidator(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("End.");
    }
}
