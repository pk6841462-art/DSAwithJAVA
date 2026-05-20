public class CircularLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }   
    }
    Node head;
    void InsertBegin(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            nn.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            nn.next=head;
            temp.next=nn;
            head=nn;
        }
    }
    void InsertEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            nn.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
         }
    }
    void traversal(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            do{System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
            System.out.println("(head)");
        }
    }
    void DeleteBegin(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==head.next){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
                
            }
            
            head=head.next;
            temp.next=head;

        }
    }
    void DeleteEnd(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==head.next){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
        }
    }
    public static void main (String[]args){
        CircularLinkedList cll=new CircularLinkedList();
        cll.InsertBegin(10);
       // cll.InsertBegin(20);
        cll.traversal();
      //  cll.InsertEnd(30);
        //cll.InsertEnd(40);
        //cll.traversal();
        cll.DeleteBegin();
        cll.traversal();
        //cll.DeleteEnd();
        //cll.traversal();
    }
}
