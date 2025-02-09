import java.util.ArrayList;

public class question {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8};
        int size = arr.length;
        ArrayList<Integer> lost = new ArrayList<>();
        lost.add(16);
        lost.add(16);
        lost.add(15);
        lost.add(14);
        lost.add(13);
        lost.add(12);
        // for (int i : lost) {
        //     System.out.println(i);
            
        // }
        
        int a = 9;
        int b =0;
        // for(int i=0; i<arr.length; i++){

        //      b -= arr[i];
        // }
        for(int i=0; i<arr.length; i++){

            b += arr[i];
       }
        System.out.println(b);

        

        // System.out.println(lost.size());
        // System.out.println(lost);
        // int m =(lost.size())/2;
        // int n =(lost.size()-1)/2;
        // int k =lost.get(m);
        // int z = lost.get(n);
        // System.out.println(k);
        // System.out.println(z);
        // System.out.println(lost);
        // System.out.println(k);

        // System.out.println(arr[size-1]/2);
    }
    
}
