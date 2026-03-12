package arraylists;

import java.util.ArrayList;

public class Ex_03 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");
        names.add("Jose");
        names.add("Andres");

        System.out.println("Primer nombre: " + names.get(0));
        System.out.println("Último nombre: " + names.get(names.size() - 1));
    }
}
