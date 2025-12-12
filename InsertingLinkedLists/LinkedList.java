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

    
    void insert_head(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        n++;
    }

    void emptyList(){
        head = null;
        n = 0;
    }

    void deleteFirst(){
        if(head != null){
            head = head.next;
            n = n - 1;
        }    
        return;   
    }

    void deleteLast(){
        Node current = head;

        if (current == null){
            return;
        }

        if (current.next == null){
            deleteFirst();
            return;
        }
        for(int i = 0; i < n - 2; i++){
            current = current.next;
        }
        current.next = null;
        n = n - 1;
    }

    void deleteByValue(int value){
        int index = 0;
        Node current = head;
        if(current.data ==  value){
            deleteFirst();
            return;
        }
        for(int i = 0; i < n; i++){
            if (current.next.data == value){
                index = i;
                break;
            }else{
                current = current.next;
            }
        }  

        if(current.next == null){
            return;
        }
           
        current.next = current.next.next; 
        n = n - 1;
    }

    int searchIndex(int value){
        int index = 0;
        Node current = head;
        for(int i = 0; i < n; i++){
            if(current.data == value){
                index = i;
                return index;
            }else{
                current = current.next;
            }
        }
        return -1;
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

    boolean insertItem(int index, int value){
        Node new_node = new Node(value);
        Node current = head;

        if (index < 0 || index > n) {
            return false;
        }

        if (head == null) {
            head = new_node;
            n++;
            return true;
        }
        

        for(int i = 0; i < n; i++){
            if (i == index){
                new_node.next = current.next;
                current.next = new_node;
                n++;
            }else{
                current = current.next;
            }
        }
        return true;
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

    void replaceMax(int newValue){
        Node current = head;
        Node max = current;

        for(int i = 0; i < n; i++){
            if (current.data > max.data){
                max = current;
            }
            current = current.next;  
        }

        max.data = newValue;
    }

    void addOdds(){
        Node current = head;
        int count = 0;
        int addOdds = 0;

        while(current != null){
            if(count % 2 != 0){
                addOdds += current.data;
            }       
            count ++; 
            current = current.next;
            
        }


        System.out.println(addOdds);
    }
}


public class LinkedList {
    public static void main(String args[]){
        CreateLinkedList Linkedlist = new CreateLinkedList();
        Linkedlist.insert_head(1);
        Linkedlist.insert_head(9);
        Linkedlist.insert_head(8);
        Linkedlist.insert_head(2);
        Linkedlist.insert_head(5);
        Linkedlist.insert_head(6);
         Linkedlist.insert_head(10);
        // Linkedlist.deleteByValue(1);
        // Linkedlist.insert_newtail(7);
        // System.out.println(Linkedlist.insertItem(3, 50));
        // Linkedlist.deleteFirst();
        // Linkedlist.deleteLast();
        System.out.println(Linkedlist.traverse());
        // Linkedlist.replaceMax(22);
        Linkedlist.addOdds();
        // System.out.println(Linkedlist.searchIndex(22));
    }
}
