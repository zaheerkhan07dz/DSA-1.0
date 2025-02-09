package arraylist;

import java.util.ArrayList;
// import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class intro {
    //<e> is class because arraylist never work with data type for ex it doesnt work with int instead integer which is class
    //syntax 1 ->Arraylist<class> arrayliats_name = new Arraylist<class>();
    //syntax 2 -> list<class> arrayliats_name = new Arraylist<class>();
    //syntax3 -> Arraylist<class> arrayliats_name = new list<class>();
    public static void main(String[] args) {

        //Integer
        ArrayList<Integer> al = new ArrayList<Integer>();
        // 2nd case -> List<Integer> al = new ArrayList<Integer>();
        al.add(59);
        al.add(500);
        al.add(6);
        al.add(8787);
        System.out.println(al.size());
        // al.sort(null); easy way
        //Collections.sort(al); another way
        System.out.println(al);

        // for (int i : al) {
        //     System.out.println(al);
        //     // System.out.println(i);  --> this will print in normal number form
            
        // }

        //string
        // ArrayList<String> al = new ArrayList<String>();
        // // 2nd case -> List<String> al = new ArrayList<Integer>();
        // al.add("heyy");
        // al.add("hello");
        // al.add("byee");
        // al.add("by");
        // // al.add(0, "juice");
        // // System.out.println(al.size());
        // // al.remove(2);
        // al.remove("by");
        // al.sort(null);
        // System.out.println(al);
        // System.out.println(al);
        // for(int i=0; i<al.size(); i++){
        //     System.out.println(al.get(i));
        // }

       
        // for (String i : al) {
            
        //     // System.out.println(i);  --> this will print in normal number form
            
        //}
        // System.out.println(al);
        // ArrayList<Double> al = new ArrayList<Double>();
        // // 2nd case -> List<String> al = new ArrayList<Integer>();
        // al.add(3.99999);
        // al.add(9.272829);
        // al.add(98.187899);
        // al.add(86.98798);


        // for (Double i : al) {
        //     System.out.println(al);
        //     // System.out.println(i);  --> this will print in normal number form
            
        // }


        //float
        // ArrayList<Float> al = new ArrayList<Float>();
        // // 2nd case -> List<String> al = new ArrayList<Integer>();
        // al.add(3.99999f);
        // al.add(9.272829f);
        // al.add(98.187899f);
        // al.add(86.98798f);


        // for (float i : al) {
        //     System.out.println(al);
        //     // System.out.println(i);  --> this will print in normal number form
            
        // }
    }
}
