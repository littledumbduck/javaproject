package arraylists;

import java.util.ArrayList;

public class Ex_01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");
        names.add("Jose");
        names.add("Juan");

        for(String name : names){
            System.out.println(name);
        }
    }
}
