// Hashing via Chaining...
package HashingClosedAddressing;
import java.util.ArrayList;

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

        while(current != null){
            if(key.equals(current.key)){
                return pos;
            }
            pos += 1;
            current = current.next;
        }
        return -1;
    }

    Node get_node(int index){
        Node current = first;
        int pos = 0;

        while(current != null){
            if(pos == index){
                return current;
            }
            pos += 1;
            current = current.next;
        }
        return null;      
    }

    String traverse(){
        Node current = first;
        String information = "";
        while(current != null){
            information = information + current.key + " : " + current.value + ", ";
            current = current.next;
        }
        return information.substring(0, information.length() - 2);
    }
}

class Dictionary{
    int capacity;
    int size = 0;
    ArrayList<LL> buckets;

    Dictionary(int capacity){
        this.capacity = capacity;
        this.buckets = make_array(capacity);
    }

    ArrayList<LL> make_array(int capacity){
        ArrayList<LL> parent = new ArrayList<>(capacity);;
        for(int i = 0; i < capacity; i++){
            parent.add(new LL());  
        }
        return parent; 
    }

    void put(String key, int value){

        int bucket_index = hash_function(key);
        int node_index = get_node_index(bucket_index, key);
        if(node_index == -1){
            // insert
                buckets.get(bucket_index).addTail(key, value); 
                size += 1;

                double loadFactor = (double) size / capacity;
                System.out.println(loadFactor);
                if(size / capacity >= 2){
                    rehash();
                }
        }else{
            // update
            Node node = buckets.get(bucket_index).get_node(node_index);
            node.value = value;
        }
        return;
    }

    int get_node_index(int bucket_index,String key){
        int node_index = buckets.get(bucket_index).search(key);

        return node_index;
    }

    void rehash(){
        capacity = capacity * 2;
        ArrayList<LL> old_buckets = buckets;
        size = 0;
        buckets = make_array(capacity);

        for(int i = 0; i < old_buckets.size(); i++){
            int count = 0;
            while(old_buckets.get(i).get_node(count) != null){
                String key = old_buckets.get(i).get_node(count).key;
                int value = old_buckets.get(i).get_node(count).value;
                this.put(key, value);
                count += 1 ;
            }
            // Node n = old_buckets.get(i).get_node(i);
        }

        }
    

    int hash_function(String key){
        return Math.abs(key.hashCode()) % capacity;
    }
}

public class HashingClosedAddressing {
    public static void main(){
        // LL l = new LL();
        // l.addTail("Python", 20);
        // l.addTail("Javascript", 30);
        // l.addTail("Java", 40);
        

        Dictionary D1 = new Dictionary(4);

        D1.put("Python", 34);
        D1.put("Java", 33);
        D1.put("JavaScript", 33);
        D1.put("Php", 33);
        D1.put("Javaa", 23);
        D1.put("Ruby", 33);
        D1.put("Rails", 33);
        D1.put("C", 23);
        D1.put("Pythonn", 34);
        D1.put("Javaaa", 33);
        D1.put("JavaScripta", 33);
        D1.put("Phpa", 33);
        D1.put("Javaaaa", 23);
        D1.put("Rubya", 33);
        D1.put("Railsa", 33);
        D1.put("Javaaaaa", 23);
        // D1.put("Rubyaa", 33);
        // D1.put("Railsaa", 33);
        
        System.out.println(D1.buckets.size());
    }
}
