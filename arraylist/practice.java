package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class practice {
  
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i:nums1) list.add(i);
            for(int i:nums2) list.add(i);   
            Collections.sort(list); 
            int size = list.size();
            //this works for both, odd and even ArrayList size 
            return (double)(list.get((size-1)/2) + list.get(size/2))/2;       
        }
    
   

    public static void main(String[] args) {
    


        // int nums1[]= {1,2};
        // int nums2[]={3};
        // findMedianSortedArrays({1,2},{3});

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int size = list.size();
        System.out.println(list.get(size/2));


    }
    
}
