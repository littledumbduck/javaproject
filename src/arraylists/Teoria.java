package arraylists;

import java.util.*;

public class Teoria {
    public static void main(String[] args) {
        ArrayList<String> queue = new ArrayList<String>();

        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("8");

        for (String f : queue) {
            System.out.println(f);
        }

        Iterator<String> it = queue.iterator();

        while (it.hasNext()) {
            String temp = it.next();
        }
    }
}
