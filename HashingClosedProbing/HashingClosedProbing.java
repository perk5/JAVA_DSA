package HashingClosedProbing;

class Node{
    String key;
    int value;
    Node next;

    Node(String key, int value){
        this.key = key;
        this.value = value;
    }
}

class LL{
    Node first = null;
    int n = 0;

    void addTail(String key, int value){
        Node new_node = new Node(key, value);
        Node current = first;
        if(first == null){
            new_node.next = null;
            first = new_node;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = new_node;
    }

    void remove(String key){
        Node current = first;
        if(first == null){
            return;
        }

        if(key.equals(current.key)){
            first = first.next;
            return;
        }

        while(current.next != null){
            if(key.equals(current.next.key)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        return;
    }

    int search(String key){
        Node current = first;
        int pos = 0;
         if(first == null){
            return -1;
        }

        while(current != null){
            if(key.equals(current.key)){
                return pos;
            }
            pos += 1;
            current = current.next;
        }
        return -1;
    }

    String traverse(){
        Node current = first;
        String information = "";
        while(current.next != null){
            information = information + current.key + " : " + current.value + "-->";
            current = current.next;
        }
        return information;
    }
}

public class HashingClosedProbing {
    public static void main(){

    }
}
