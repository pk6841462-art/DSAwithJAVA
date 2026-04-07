public class SLL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    //insert at beginning
    public void InsertAtBegin(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
           
        }
    }
    //traversal of linkedlist
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    //insert at end
    public void InsertAtEnd(int data){
        Node temp=head;
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }

    }
    //insert at any given position
    public void InsertAtPosition(int data,int pos){
        Node nn=new Node(data);
        Node temp=head;
        int count=0;
        if(head==null){
            head=nn;
        }
        else{
            while(temp!=null&&count<pos-1){
                temp=temp.next;
                count++;
            }
            if(temp!=null){
                nn.next=temp.next;
                temp.next=nn;
            }
            else{
                System.out.println("invalid position");
            }
            
        }
    }
    //dete from begin
    public void DeleteFromBegin(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.next;
        }
    }
    public void deleteFromEnd(){
    if(head == null){
        System.out.println("List is empty");
    }
     else if(head.next == null){
        // Only one node
        head = null;
    }
    else{
        Node temp = head;

        // Move till second last node
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null; // remove last node
    }
}
public int deleteFromPosition(int pos){
    if(head == null){
        System.out.println("List is empty");
        return -1;
    }

    // Delete from beginning
    if(pos == 0){
        int data = head.data;
        head = head.next;
        return data;
    }

    Node temp = head;
    int count = 0;

    while(temp != null && count < pos - 1){
        temp = temp.next;
        count++;
    }

    // Invalid position
    if(temp == null || temp.next == null){
        System.out.println("Invalid position");
        return -1;
    }

    Node del = temp.next;
    int data = del.data;

    temp.next = del.next;
    del.next = null;

    return data;
}   
public void modifyBegin(int data){
    if(head == null){
        System.out.println("List is empty");
    } else {
        this.head.data = data;
    }
}
public void ModifyEnd(int data){
    if(head==null){
        System.out.println("list is empty");
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.data=data;
    }
}
public void modifyKey(int oldkey,int newkey){
    if(head==null){
        System.out.println("list is empty");
    }
    else{
        Node temp=head;
        while(temp!=null){
            if(temp.data==oldkey){
                temp.data=newkey;
            }
            temp=temp.next;
        }
        
    }
}
public void ReverseTraversal(Node temp){
    if(temp==null){
        return;
    }
    else{
        ReverseTraversal(temp.next);
        System.out.print(temp.data+"-->");
    }
}
 public static void main(String[]args){
        SLL ll=new SLL();
        ll.InsertAtBegin(10);
        ll.InsertAtBegin(20);
        ll.InsertAtBegin(30);
        //ll.display();
        ll.InsertAtEnd(100);
        ll.InsertAtEnd(200);
        //ll.display();
        ll.InsertAtPosition(500, 3);
        ll.display();
        //ll.DeleteFromBegin();
       //ll.deleteFromEnd();
       //ll.deleteFromPosition(2);
      // ll.modifyBegin(44);
       // ll.display();
        //ll.ModifyEnd(55);
        ll.modifyKey(500,47);
        ll.display();
        ll.ReverseTraversal(ll.head);
    }
    
}
