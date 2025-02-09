import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int []arr = new int[n];
        

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            
        
        }
        for (int v : arr) {
            System.out.print(v );
            
        }
        System.out.println();
       
        System.out.println("enter the size of second array");
        int p = sc.nextInt();
        int []arr2 = new int[p];
    

    for(int j = 0; j<p; j++){
        arr2[j] = sc.nextInt();
        
    
    }
    for(int j=0; j<p; j++){

        System.out.println(arr2[j]);
    }
    System.out.println();
    
    System.out.println("enter the size of third array");
    int q = sc.nextInt();
    int []arr3 = new int[q];


for(int k = 0; k<q; k++){
    arr3[k] = sc.nextInt();
    

}
for(int k=0; k<q; k++){

    System.out.println(arr3[k]);
}
        
        
    }
}
