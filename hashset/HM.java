package hashset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HM {
    public static void main(String[] args) {
        // HashMap<Integer,Integer> hs = new HashMap<>();
        //   hs.put(1, 102);
        //   hs.put(2, 102);
        //   hs.put(3, 103);
        //   hs.put(4, 104);


        //write a programme to create a hashmap with single key and value
        //linked hasmap is used to print in originaal order and print in set type [] <-- bracket
        LinkedHashMap<Integer,String> hs = new LinkedHashMap<>();
        hs.put(1, "heyy");
        hs.put(3, "go");
        hs.put(2, "byy");
        hs.put(3, "kill");

      System.out.println(hs);
      System.out.println(hs.containsKey(3));//check key
      System.out.println(hs.containsValue("gp"));//check value
      System.out.println(hs.get(3));
      System.out.println(hs.getOrDefault(8, "value not found"));//check and give alternate
      hs.putIfAbsent(4, "polo");

      System.out.println(hs);
      System.out.println(hs.keySet());
      System.out.println(hs.entrySet());

  }
}

//write a programme to create 3 arraylist 
//1 for float
//1 for string
//1 for integer
//youur task is to add all the arraylist into one arraylist 
