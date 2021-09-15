import java.util.Scanner;

// import org.graalvm.compiler.nodes.calc.AddNode;

public class Documents09 {
    class Node {
        Node next;
        char data;
        public Node(char data){
            this.next=null;
            this.data=data;
        }
    }
    public Node head =null;
    public Node tail=null;
    public Node prev =null;
    int size=0;

    public void addNode(char data){
        Node newNode= new Node(data);
       if(head==null){
           head = newNode; 
           tail = newNode;
           size+=1;
       }
       else{
           tail.next= newNode;
           tail=newNode;
           tail.next=null;
           size+=1;
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
            System.out.println(current.next.data);
            current=current.next;
            break;
             }
        }
    }
    public void verify(){
        String arr[]= new String[];
        Node current =  head;
        while(current != null){
            if(current.data == '-' && current.data != '-'){

            }
        }
    }


        public static void main(String[] args) {
            Documents09 list = new Documents09();
            
            String str;
            Scanner s= new Scanner (System.in);
            System.out.println("Enter String");
            str=s.nextLine();
           
            for(int i=0;i<str.length();i++){
                list.addNode(str.charAt(i));
            }
            list.display();

    }
}
