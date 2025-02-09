package arraylist;

public class practice4 {
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,4,5,6};
        int arr2[] =new int[7];

        for(int i=0; i<arr.length; i++){
            if(arr[i+1]!=arr[i]){
                arr2[i]=arr[i];
            }
        }
        System.out.println(arr2);
            
        }
    }

    
    

