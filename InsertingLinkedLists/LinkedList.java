package InsertingLinkedLists;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class CreateLinkedList{

    Node head = null;
    int n = 0;

    // CreateLinkedList(){
    //     this.head = head;
    //     this.n = n;
    // }

    int lengthOfNodes(){
       return n; 
    }

    void insert_head(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        n++;
    }

    void insert_newtail(int value){
        Node tailNode = new Node(value);

        if (head == null) {
            head = tailNode;
            n++;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = tailNode;
        n++;
    }

    String traverse(){

        if (head == null) {
            return "Empty List";
        }
        Node current = head;
        String sequence = "";
        while(current != null){
            sequence += "[" + current.data + "]" + "->";
            current = current.next;
        }
        return sequence.substring(0, sequence.length() - 2);
    }



}


public class LinkedList {
    public static void main(String args[]){
        CreateLinkedList Linkedlist = new CreateLinkedList();
        // Linkedlist;
        Linkedlist.insert_head(1);
        Linkedlist.insert_head(2);
        Linkedlist.insert_head(3);
        Linkedlist.insert_head(4);
        Linkedlist.insert_head(5);
        Linkedlist.insert_head(6);
        Linkedlist.insert_newtail(7);
        System.out.println(Linkedlist.lengthOfNodes());
        System.out.println(Linkedlist.traverse());
    }
}
