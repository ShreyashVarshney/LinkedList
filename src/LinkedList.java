import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class LinkedList {
    Node START;
    LinkedList()
    {
        START=null;
    }
    void insert()
    {
        System.out.println("Enter ur roll number ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        Node nn=new Node();
        nn.rollno=data;
        nn.next=null;

        if(START == null)
        {
            START=nn;
        }
        else
        {
            Node current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
    }

    void delete()
    {
        if(START==null){
            System.out.println("List Empty");
        }
        else{
            System.out.println("dedleted..."+START.rollno);
            if(START.next==null){
                START=null;
            }
            else{
                START=START.next;
            }
        }
    }
    void deleteAll()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("ALL element's deletedd....");
            START=null;
        }
    }
    void traverse()
    {
        if(START==null){
            System.out.println("List Empty");
        }
        else{
            System.out.println("----list element----");
            Node current;
            for(current=START;current!=null;current=current.next){
                System.out.println(" "+current.rollno);
            }
        }
    }
    public static void main(String args[]){
        LinkedList obj=new LinkedList();
        Scanner sc =new Scanner(System.in);
        while(true)
        {

            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete ");
            System.out.println("Press 3 for traverse ");
            System.out.println("Press 4 for exist ");
            System.out.println("Press 5 for delete all ");
            System.out.println("Enter the choice ");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.deleteAll();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}