import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
             
             if(arr[i]%2 == 0){
                sum = arr[i] +sum;

             }
             else{
                sum1 = arr[i] +sum1;
             }
             

        }
        if(sum>sum1)
        {
            System.out.println(sum-sum1);
        }
        else
        {
            System.out.println(sum1-sum);
        }

    }
    
}
