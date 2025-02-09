public class bubblesort {
    public static void main(String[] args) {
        // int max = Math.Integer.Min_value
        // int arr[]= {1,4,2,10,23,3,1,0,20};
        // int k=4;
        // int n = arr.length;
        // int sum=0;
        // for(int i=0; i<k;i++){
        // sum = sum+arr[i];

        // }
        // int slidesum = sum;
        // for(int i=k;i<n;i++){

        // slidesum=slidesum+arr[i]-arr[i-k];
        // max = Math.max(max, slidesum);
        // }
        // System.out.println(max);

        int arr[] = { 1, 6, 5, 3, 2, 9 };
        int temp = 0;
        
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }
        }
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }

}
