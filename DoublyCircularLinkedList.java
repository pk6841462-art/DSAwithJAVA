public class DoublyCircularLinkedList {
    class Node{
        int data;
        Node next,prev;
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
            head.next=head;;
            head.prev=head;
            return;
        }
        else{
            Node last=head.prev;
            nn.next=head;
            nn.prev=last;

            last.next=nn;
            head.prev=nn;
            head=nn;   
        }
        
    }
    void traversal(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
        }
        
    }
    void InsertEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            nn.next=head;
            nn.prev=head;
        }
        else{
            Node last=head.prev;

            last.next=nn;
            nn.prev=last;
            nn.next=head;
            head.prev=nn;

        }
    }
    void deleteBegin(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==head.next){
            head=null;
        }
        else{
            Node last = head.prev;
            head=head.next;
            last.next=head;
            head.prev=last;

        }

    }
    public static void main(String[]args){
        DoublyCircularLinkedList dcl=new DoublyCircularLinkedList();
        dcl.InsertBegin(10);
        dcl.InsertBegin(20);
        dcl.traversal();
        dcl.InsertEnd(99);
        dcl.InsertEnd(100);
        dcl.traversal();
    }
}
