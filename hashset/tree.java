package hashset;

import java.util.TreeMap;

public class tree {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1,"tee");
        tm.put( 2,"Cpp");
        tm.put( 3,"Java");
        // tm.put("Cpp", 4); updates the value
        System.out.println(tm);
        
        // System.out.println(tm.get("Cpp"));
        // System.out.println(tm.getOrDefault("lpp", null));
        // System.out.println(tm.containsKey("java"));
        // System.out.println(tm.containsValue(3));
        // tm.putIfAbsent("rust", 8);
        // System.out.println(tm.descendingMap());
        // System.out.println(tm.ceilingKey()); wrror
    }

}
