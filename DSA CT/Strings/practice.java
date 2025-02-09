

public class practice {
    
        public static String reverseWords(String s) {
              String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
                StringBuilder temp=new StringBuilder(word);
                temp.reverse();
                result.append(temp);
                result.append(" ");
            }
        return result.toString().trim();
        }
    

    
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest  ";
    //    String k =  reverseWords(s);

    //    System.out.println(k);

    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();
    String temp1;
    for (String word : words) {
            StringBuilder temp=new StringBuilder(word);
            temp.reverse();
            result.append(temp);
            result.append((" "));
    }
    System.out.println(result);

      
    }
}