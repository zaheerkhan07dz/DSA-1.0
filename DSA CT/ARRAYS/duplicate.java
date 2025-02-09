import java.util.Scanner;

public class duplicate {
    /**
     * @param args
     */

     public static int  removeDuplicates(int arr[], int n){
        int i=0;
        int k=0;
        int [] arr2 = new int[arr.length];
        
        for(i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr2[k] = arr[i];
                k++;
            }
           
        }
        arr2[k++]=arr[arr.length-1];

        for(i=0;i<k;i++){
            arr[i]=arr2[i];
        }
    

        return k;
     }
    public static void main(String[] args) {

        //  Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // int j=0;
        // int i;
        // for (i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {1,2,3,4,4,5,6,6};
        int n = arr.length;

        // n=removeDuplicates(arr, n);
        int i=0;
        int k=0;
        int [] arr2 = new int[arr.length];
        
        for(i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr2[k] = arr[i];
                k++;
            }
           
        }
        arr2[k]=arr[arr.length-1];
        k++;

        for(i=0;i<k;i++){
            System.out.println(arr2[i]);
        }
    

        // int j=0;
        // for ( i = 0; i <arr.length-1; i++) 
        // {
        //     for( j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //         System.out.println(arr[j]);
        //         }
        //     }
        // }
        // System.out.println(arr.length);
        
    

        //runned
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int n = sc.nextInt();
        // int []arr = new int[n];
        // System.out.println("Enter the elements");

        // for(int i =0; i<n;i++){ 
            
        //     arr[i] = sc.nextInt();

            
        // }
        // int i=0;
        // int j=0;
        // System.out.println("your duplicate numbers are");
        // for ( i = 0; i <arr.length; i++) 
        // {
        //     for( j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //         System.out.println(arr[j]);
        //         }
        //     }
        // }
        // int temp[] = new int[n];
        // int c=0;
        // temp[c] = arr[0];
        // for( i =0; i<5; i++){
        //     if(temp[c]!=arr[i]){
        //         c++;
        //         temp[c] =arr[i];
                

        //     }
            
        //     }
        //     System.out.println("And your new array is");
        //     for( i=0; i<temp.length; i++){
        //         System.out.println(temp[i]);
        //     }
        
    //   Scanner sc=new Scanner(System.in);
    //   int count=0;
    //   System.out.println("enter the size of an array:-");
    //   int size=sc.nextInt();
    //   int[] arr=new int[size];
    //   int[] c= new int[7];
    //   int k=0;
    //   System.out.println("enter the elements of an array:-");
    //   for(int i=0;i<arr.length;i++)
    //   {
    //      arr[i]=sc.nextInt();
    //   }
    //  System.out.println("duplicate number will be:-");
    //   for(int i=0;i<arr.length;i++)
    //   {
    //      for(int j=i+1;j<arr.length;j++)
    //      {
    //      if(arr[i]!=arr[j])
    //      { count++;
    //         c[k]=arr[i];
    //         k++;
    //      }
    //      }
    //   }
    //   System.out.println("new array will be:-");
    //   for(int i=0;i<c.length;i++)
    //   {
    //      System.out.println(c[i]);
    //   }
   }
}




