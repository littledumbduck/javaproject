package boletin_14;

import java.io.*;
import java.util.ArrayList;
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

            ArrayList<String> arrayOrder = new ArrayList<String>();
            String order;
            while ((order =  br2.readLine()) != null) {
                arrayOrder.add(order);
            }

            arrayOrder.stream().sorted().forEach(System.out::println);
            fr = new FileWriter(scanner + "_sort.txt");
            pw = new PrintWriter(fr);
            for (String c : arrayOrder) {
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
            } catch (NullPointerException | IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
