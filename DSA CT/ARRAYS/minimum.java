import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }
    
}
