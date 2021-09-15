package DS;
public class doublyLinkedlist {
  class Node{
    public Node(int data) {
        this.data=data;
    }
    Node next;
    Node prev;
    int data;
  }
  Node head=null;
  Node tail=null;
  public void addList(int data){    
    Node newNode= new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
  }

  public void display(){
      if(head== null) {
        System.out.println("List empty");
      }
      else{
        Node current = head;
        System.out.println("List is");
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
      }
  }

  public void deleteFront(){
    if(head== null) {
        System.out.println("List empty");
      }
      else{
          head=head.next;
          head.prev=null;
      }
  }



  public static void main(String[] args) {   
    doublyLinkedlist sList = new doublyLinkedlist();  
    sList.addList(1);
    sList.addList(2);
    sList.addList(3);
    sList.addList(4);
    sList.display();
    sList.deleteFront();
    sList.display();
    }
}
