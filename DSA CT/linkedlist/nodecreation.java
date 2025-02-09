package linkedlist;

class Node{
    Node head;
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
    
    public void push(int new_data){
        Node new_node  = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
public class nodecreation {

    public static void main(String[] args) {


        // str1 = level 
        // str2 = evell

        // str1.toCharArray()
        // str1.toCharArray()

        //Arrays.sort

     
    }

   
    
}
