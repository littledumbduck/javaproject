package boletin_14;

import java.io.*;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileReader fr2 = null;
        BufferedReader br2 = null;

        try {
            Scanner sc = new Scanner(System.in);
            fw = new FileWriter("ejer4.txt");
            pw = new PrintWriter(fw);
            System.out.print("Type file 1 you want to mix: ");
            String scanner = sc.nextLine();
            fr = new FileReader(scanner);
            br = new BufferedReader(fr);
            System.out.print("Type file 2 you want to mix: ");
            scanner = sc.nextLine();
            fr2 = new FileReader(scanner);
            br2 = new BufferedReader(fr2);
            boolean loop1 = true;
            boolean loop2 = true;
            String line;

            while(loop1 || loop2) {
                if ((line = br.readLine()) != null) {
                    pw.println(line);
                } else {
                    loop1 = false;
                }

                if ((line = br2.readLine()) != null) {
                    pw.println(line);
                } else {
                    loop2 = false;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                pw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
