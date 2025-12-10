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

    void insertItem(int index, int value){
        Node new_node = new Node(value);
        Node current = head;
        for(int i = 0; i < n; i++){
            if (i == index - 1){
                new_node.next = current.next;
                current.next = new_node;
                n++;
            }else{
                current = current.next;
            }
        }
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
        Linkedlist.insert_head(1);
        Linkedlist.insert_head(2);
        Linkedlist.insert_head(3);
        Linkedlist.insert_head(4);
        Linkedlist.insert_head(5);
        Linkedlist.insert_head(6);
        Linkedlist.insert_newtail(7);
        Linkedlist.insertItem(3, 50);
        System.out.println(Linkedlist.lengthOfNodes());
        System.out.println(Linkedlist.traverse());
    }
}
