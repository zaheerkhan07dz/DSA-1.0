import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       // sum of all elements
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];

        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum = arr[i] +sum;
        }
        System.out.println(sum);
    }
}
