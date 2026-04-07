public class Queue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front,rear;
    void enqueue(int data){
        Node nn=new Node(data);
        if(front==null){
            front=rear=nn;
        }
        else{
            rear.next=nn;
            rear=nn;
        }
    }
    void dequeue(){
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            front=front.next;
            if(front==null){
                rear=null;
            }
        }
    }
    void display(){
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            Node temp=front;
            while(temp!=null){
                
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println(" rear");
        }
    }
    public static void main(String[]args){
        Queue qq=new Queue();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.dequeue();
        qq.display();

    }
}