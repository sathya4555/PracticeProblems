package DS;
// import org.graalvm.compiler.nodes.java.NewArrayNode;

public class LinkedList{

    class Node {
        Node next;
        int data;
        public Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    public Node head =null;
    public Node tail=null;
    public Node prev =null;
    public void addNode(int data){
         Node newNode= new Node(data);
        if(head==null){
            head = newNode; 
            tail = newNode;
        }
        else{
            tail.next= newNode;
            tail=newNode;
            tail.next=null;
        }
    }

    public void display(){
        Node current= head;
        if(head == null){
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is ");
            while(current != null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public void removefirst(){
        if(head == null){
            System.out.println("List empty");
        }
        else{
            head=head.next;
        }
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List empty");
        }
        else{
            Node current=head;
            Node previous= null;
            // System.out.println("Resultlast"+current.next.next.data);
            try{
                while(current.next != null){
                    // System.out.println(current.data);
                    previous = current;
                    current=current.next;
                }   
                previous.next=null;
                System.out.println("delete node = "+current.data );
            }catch(Exception err){
                System.out.println("error"+ err);
            }
               
        }
    }

    public void insertPosition(int position,int data){
        Node newNode=new Node(data);
        Node current = head;
        int i=0;
        while (current!= null){
            if(position == i){
                Node temp=current.next;
                System.out.println("Current data"+ current.data);
                newNode.next=temp;
                current.next=newNode;
                display();
                current=current.next;
            }
            ++i;
        }
    }

    

    public static void main(String[] args) {   
        LinkedList sList = new LinkedList();  
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);   
        sList.addNode(5);  
        // sList.display(); 
        // sList.removefirst(); 
        // sList.removeLast();
        sList.insertPosition(4,88);
        sList.display();  
    }
}

