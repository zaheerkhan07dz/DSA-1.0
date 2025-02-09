package linkedlist;
import java.util.*;

public class collection {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        // System.out.println(list);

        list.addFirst("This");
        list.addLast("List");
        // list.add("List"); add normally add node in the last
        
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("NUll");

        list.removeFirst();
        // list.removeLast();
        // list.removeAll(list);

        list.remove(2);
        System.out.println(list);
    }
    
}
