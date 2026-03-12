package arraylists;

import java.util.ArrayList;

public class Ex_02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");
        names.add("Jose");
        names.add("Juan");

        names.add(2, "Emilio");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Posicion 2: " + names.get(2));

    }
}
