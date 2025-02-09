package hashset;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class shraddhaHM {
    public static void main(String[] args) {
         HashMap<Integer,Integer> hs = new HashMap<>();
         //it prints in ascending order

          hs.put(1, 102);
          hs.put(2, 102);
          hs.put(4, 104);
          hs.put(3, 103);
          System.out.println(hs.get(3));
        //   System.out.println(hs);

          //iteation in HashMap

        //   for(Map.Entry<Integer,Integer> e:hs.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());

        //   }

          //2nd way

          Set<Integer> keys = hs.keySet();
          for (Integer key : keys) {
            System.out.println(key +" "+ hs.get(key));

            
          }




    }
    
}
