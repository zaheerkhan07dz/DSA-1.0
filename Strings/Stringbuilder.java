// package Strings;
import java.util.Stack;

public class Stringbuilder {

static class Node{
    int data;
    Node next;
    public  Node(int data ){
        this.data = data;
        next = null;

}
}

 static class stack{
    public static Node head;
    public static boolean isEmpty(){
        return head == null;

    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public static int top(int data){
        if(isEmpty()){
            
            return -1;
        }
        int top =head.data;
        head = head.next;
        return top;

    }
    public static int peek(int data){
        if(isEmpty()){
            
            return -1;
        }
        
        return head.data;


    }
   

    }

 

    public static void main(String[] args) {

        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(s.isEmpty()){
            System.out.println(s.peek());
        }
       
        
    }
    
}


        // StringBuilder sb = new StringBuilder("z");
        // sb.append("a");
        // sb.append("h");
        // sb.append("e");
        // sb.append("e");
        // sb.append("r");
        // System.out.println(sb);
        // System.out.println(sb.length());

        //char at index 0
        // System.out.println(sb.charAt(2));


        //set char at

        // sb.setCharAt(3, 'p');
        // System.out.println(sb);
        //insert
        // sb.insert(3, 'p');
        // System.out.println(sb);

        // //delete
        // sb.delete(2, 4);//4 not included
        // System.out.println(sb);

        //Question : reverse the string

        // StringBuilder sb = new StringBuilder("zaheer");

        // for(int i =0; i<sb.length()/2;i++){

        //     int front = i;
        //     int back = sb.length()-1-i;//6-1-0 i.e = 5 z is shifted to 5th position

        //     char frontchar= sb.charAt(front);
        //     char backchar = sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);


        // }
        // System.out.println(sb);
        

