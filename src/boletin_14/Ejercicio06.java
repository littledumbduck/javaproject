package boletin_14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entry = false;
        char[] order = new char[500];
        FileWriter fw = null;
        PrintWriter pw = null;

        System.out.println("Nombre del .java: ");
        String fileName = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName + ".java"))) {
            fw = new FileWriter(fileName + "_nocomments.java");
            pw = new PrintWriter(fw);
            String line;
            while ((line = reader.readLine()) != null) {
                order =  reader.readLine().toCharArray();
                for (int i = 0; i < order.length; i++) {
                    entry = false;
                    if (order[i] == '/') {
                        entry = true;
                    }
                    emptyChar(order);

                    if (!entry) {
                        pw.println(line);
                        System.out.println(line);
                    }

                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
            try {
                fw.close();
                pw.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void emptyChar(char[] array) {
        Arrays.fill(array, (char) 0);
    }
}
