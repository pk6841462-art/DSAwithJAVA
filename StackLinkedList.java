public class StackLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    void push(int data){
        Node nn=new Node(data);
        nn.next=top;
        top=nn;
        //System.out.print(data+"is pushed into stack");
    }
    void pop(){
        if(top==null){
            System.out.println("stack is underflow");
        }
        else{
            top=top.next;
            }
        }
    void display(){
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print("null");
        }
        System.out.println();
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data+"the top data is peeked");
        }
    }
public static void main(String[]args){
    StackLinkedList SLL=new StackLinkedList();
    SLL.push(10);
    SLL.push(20);
    SLL.push(30);
    SLL.push(40);
    SLL.peek();
    SLL.pop();
    SLL.display();
    SLL.peek();
}
}