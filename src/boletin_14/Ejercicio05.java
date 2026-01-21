package boletin_14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        FileWriter fr = null;
        PrintWriter pw = null;
        FileReader fr2 = null;
        BufferedReader br2 = null;
        String scanner;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Type file name: ");
            scanner = sc.nextLine();
            fr2 = new FileReader(scanner + ".txt");
            br2 = new BufferedReader(fr2);

            char[] order =  br2.readLine().toCharArray();
            Arrays.sort(order);

            fr = new FileWriter(scanner + "_sort.txt");
            pw = new PrintWriter(fr);
            for (char c : order) {
                pw.write(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                pw.close();
                fr.close();
                br2.close();
                fr2.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
