package boletin_14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio01 {
    public static void main(String[] args) {

        FileWriter writer = null;
        PrintWriter pw = null;


        try {
            writer = new FileWriter("primos.dat");
            pw = new PrintWriter(writer);
            for(int i=1;i<=500;i++) {
                if(isPrime(i)) {
                    pw.println("Prime: " + i);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                pw.close();
                writer.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
