package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Maincito {
    public static void main(String[] args) {
        ArrayList<Student> classroom = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar estudiantes");
            System.out.println("4. Eliminar estudiantes");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addStudent(classroom);
                    break;
                case 2:
                    showStudents(classroom);
                    break;
                case 3:
                    searchStudent(classroom);
                    break;
                case 4:
                    removeStudent(classroom);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    loop = false;
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> classroom) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.print("\nIngrese la edad: ");
        int age = sc.nextInt();
        System.out.print("\nIngrese la nota media: ");
        double averageGrade = sc.nextDouble();
        Student temp = new Student(name, age, averageGrade);
        classroom.add(temp);
        System.out.println("__________________");
        System.out.println(temp.toString());
        System.out.println("Estudiante " + name + " añadido.");
        System.out.println("__________________");
    }

    public static void showStudents(ArrayList<Student> classroom) {
        for (Student student : classroom) {
            System.out.println("__________________");
            System.out.println(student.toString());
            System.out.println("_________________");
        }
    }

    public static void searchStudent(ArrayList<Student> classroom) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();

        for (Student student : classroom) {
            if (student.getName().equals(name)) {
                System.out.println("__________________");
                System.out.println(student.toString());
                System.out.println("__________________");
            }
        }
    }

    public static void removeStudent(ArrayList<Student> classroom) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        for (Student student : classroom) {
            if (student.getName().equals(name)) {
                classroom.remove(student);
                System.out.println(student.toString());
                System.out.println("__________________");
                System.out.println("Estudiante " + name + " eliminado.");
                System.out.println("__________________");
                break;
            }
        }
    }
}
