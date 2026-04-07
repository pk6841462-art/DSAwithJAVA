public class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void InsertAtBegin(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    void InsertAtEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    void Traversal(){
        if (head==null){
            System.out.println("linked list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    }
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
        ll.InsertAtBegin(10);
        ll.InsertAtBegin(20);
        ll.InsertAtBegin(100);
        ll.InsertAtBegin(200);
        ll.InsertAtEnd(99);
        ll.InsertAtEnd(88);
        ll.Traversal();
    }
}