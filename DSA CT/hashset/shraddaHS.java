package hashset;
import java.util.HashSet;
import java.util.Iterator;


//Hashset is important because of its time complexity
//insert/add => O(1);
//search/contain =>O(1);
//delete/remove => o(1);

public class shraddaHS {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        // // set.add(1); //no change
        // System.out.println(set);

        // //search/containes;
        // System.out.println(set.contains(1)); 


        // //delete 
        // set.remove(1);
        // System.out.println(set);
        // System.out.println(set.contains(1)); 

        //size
        // System.out.println("size of set is "+set.size());

        //Iterator

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }







    }
    
}
