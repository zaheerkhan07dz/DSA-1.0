public class quicksort {

    static int partition(int arr[], int start, int end){

        int pivot = arr[end];
        int temp=0;
        int i =start-1;
        for(int j=start;j<end; j++){
            if(pivot<arr[j]){
                i++;
                 temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

       temp=arr[i+1];
       arr[i+1]=arr[end];
      arr[end] = temp;


       
        return i+1;
        
    }

    //soritng
    static void sort(int arr[], int start, int end){
        if(start<end){
            int p = partition(arr, start, end);
            sort(arr, start, p-1);
            sort(arr, p+1, end);


        }

    }


    //for displaying
    static void disp(int[] arr){
        for (int  i : arr) {
            System.out.println(i+" ");
            
        }
    }
   
    public static void main(String[] args) {
        int arr[]={1,4,5,9,3,2,7,4};
       sort(arr, 0, arr.length-1);
       disp(arr);



    }
    
}
