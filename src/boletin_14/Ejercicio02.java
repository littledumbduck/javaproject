package boletin_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("primos.dat"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
