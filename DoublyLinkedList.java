public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            next=prev=null;
        }
    }
    Node head;
    void InsertBegin(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
    }
    void InsertEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            nn.prev=temp;
        }
    }
    void DeleteBegin(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    void DeleteEnd(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
        }
    }
    void traversal(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                 temp=temp.next;
            }
           
            System.out.println("null");
        }
    }
    public static void main(String[]args){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.InsertBegin(10);
        dll.InsertBegin(20);
        dll.traversal();
        dll.InsertEnd(30);
        dll.traversal();
        dll.DeleteBegin();
        dll.traversal();
        dll.DeleteEnd();
        dll.traversal();

    }
}
