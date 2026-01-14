package boletin_13;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Input age: ");

        try {
            age = input.nextInt();
            System.out.println("Age introduced: " + age);

            if (age < 18) {
                throw new Exception("Must be greater than 18");
            }

            System.out.println("Age: " + age);

        } catch (Exception error) {
            System.out.println(error.getMessage());
            System.out.println("No number introduced.");
        }
        System.out.println("End.");

    }

}
