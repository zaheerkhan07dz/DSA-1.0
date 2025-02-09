package recursion;



public class intro {
    // factorial
//     public static void printNum(int i, int n, int ans ){
//         if(i==n){
//             ans *=i;
//             System.out.println(ans);
//             return;
//         }
//         ans *=i;
        
//         printNum(i+1, n, ans);
      
//     }


//fibonacci number
    //   public static void fibonum(int a, int b, int n){

    //     if(n==0){
            
    //         return;

    //     }
    //     int c = a+b;
    //     System.out.println(c);
    //     fibonum(b, c, n-1);
    //   }

    //doubt
    // public static int calcPow(int x, int n){
    //     if(n==0){

    //         return 1;//base case 1;
    //     }
    //     if(x==0){
    //         return 0; //basecase 2
    //     }

    //     int xpowr1 = calcPow(x, n-1); //calling recursively
    //     int xpown = x* xpowr1;
    //     return xpown;

    // }


    //print string in reverse order
    // public static void printRev(String str, int index){

    //     if(index==0){
    //         System.out.println(str.charAt(index));
    //         return;

    //     }
    //     System.out.print(str.charAt(index));
    //     printRev( str, index-1);

    // }

    //find occurence first and last

    public static int first = -1;
    public static int last = -1;

    public static void findocc(String s, int index, char element){

        if(index==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = s.charAt(index);
        if(currChar==element){
            if(first ==-1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findocc(s, index+1, 'a');

    }


    public static void main(String[] args) {
     

        // int a =0;
        // int b = 1;

        // System.out.println(a);
        // System.out.println(b);

        // int n = 7;

        // fibonum(a, b, n-2);
        // printNum(1,5,1);
        
        // int ans = calcPow(2,5);
        // System.out.println(ans);

        // String str = "abcd";
        // printRev(str, str.length()-1);

        String s = "zaheera";
        findocc(s,  0, 'a');


    }
    
}
