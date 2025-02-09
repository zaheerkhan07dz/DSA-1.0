package linkedlist;
//yt

public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;

    }
    class Node {

        String data;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;
            size++;

        }

    }

    // add at firsst position

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }
    // add at last position

    public void addlast(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // this is also done by head.next but.....
        /// currnode is important because we never manipulate head node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    // print

    public void printList() {
        if (head == null) {

            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    ///delete

    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        head = head.next;
        size--;

    }
    public void deletelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }


        size--;
        if(head.next == null){
            head = null;
            return;

        }
        Node secondlast = head;
        Node lastNode = head.next;

        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondlast= secondlast.next;

        }

        secondlast.next = null;
       


    }

    public int getsize(){
        return size;
    }


    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addlast("list");
        list.addFirst("this");
        list.printList();

        // list.deletefirst();
        // list.deletelast();
        list.printList();
        
        System.out.println(list.getsize());

    }

}
