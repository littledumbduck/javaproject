package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// File: para abrir un fichero

// FileReader: lectura carácter fichero de texto
// BufferedReader: lectura líneas fichero de texto

// FileWriter: escritura carácter fichero de texto
// PrintWriter: para escribir lineas completas

// FileOutputStream: escritura carácter binario
// BufferedOutputStream: escritura línea binario

// FileInputStream: lectura de carácteres binario
// BufferedInputStream: lectura de líneas binario

public class Testing {
    public static void main(String[] args) {
        FileWriter writer = null;
        PrintWriter pw = null;

        try {
            // operaciones
            writer = new FileWriter("test.txt");
            pw = new PrintWriter(writer);

            for(int i=0;i<10;i++) {
                pw.println("Line " + (i+1));
            }

            pw.println("prueba");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                pw.close();
                writer.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }
    }
}
