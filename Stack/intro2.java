import java.util.ArrayList;

public class intro2 {

    public static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
                return list.size()==0;
        }

        //push
        public void push(int data){
            list.add(data);
        }
    
     public  int pop(){
    if(list.isEmpty()){
        return -1;
    }
            int top = list.get(list.size()-1); //for getting that variable in top
            list.remove(list.size()-1);//remove
            return top;// return element because pop remove and shows that element
        }

        public  int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(); //bacause every method is in class so we make instance variable of that class
        s.push(1); //s ke andar ka push call krdo
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
