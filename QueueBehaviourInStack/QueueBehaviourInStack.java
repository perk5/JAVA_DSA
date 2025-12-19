// Incomplete....

package QueueBehaviourInStack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

}

class StackHome{
    Node frontInsertStack;
    Node rearInsertStack;

    void newNodeFirst(int data){
        Node new_node = new Node(data);
        if(frontInsertStack == null){
            frontInsertStack = new_node;
            return;
        }
        new_node.next = frontInsertStack;
        frontInsertStack = new_node;
    }

    // void reverse(){
    //     Node current = frontInsertStack;
    //     Node prev = null;
    //     while(current != null){
    //         Node next_Node = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next_Node;
    //     }
    //     frontInsertStack = prev;
    // }

    void newNodeLast(int data){
        Node current = rearInsertStack;
        Node new_node = new Node(data);
        if(current == null){
            rearInsertStack = new_node;
            return;
        } 
        
        while(current.next != null){
            current = current.next;
        }
        current.next = new_node;
    }
        
    // void enqueue(int data){
    //     Node new_node = new Node(data);
    //     if(frontInsertStack == null){
    //         frontInsertStack = new_node;
    //         return;
    //     }
    //     new_node.next = frontInsertStack;
    //     frontInsertStack = new_node;
    // }

    // void dequeue(){
    //     if(rearInsertStack == null){
    //         rearInsertStack = frontInsertStack;
    //     }
    //     rearInsertStack = rearInsertStack.next;

    // }
    
    // void enqueue(int data){
    //     Node new_node = new Node(data);
    //     if(rear == null){
    //         rear = new_node;
    //         front = rear; 
    //     }else{
    //         rear.next = new_node;
    //         rear = rear.next;
    //     }
    // }

    // boolean isempty(){
    //     return front == null;
    // }

    // void dequeue(){   
    //    if(front == null){
    //     return;
    //    }
    //    front = front.next;
    // }
    
    void traverses(){
        Node current = frontInsertStack;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void traversel(){
        Node current = rearInsertStack;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}


public class QueueBehaviourInStack {
    public static void main(){
        StackHome s = new StackHome();
        StackHome l = new StackHome();

        s.newNodeFirst(5);
        s.newNodeFirst(6);
        s.newNodeFirst(7);
        l.newNodeLast(5);
        l.newNodeLast(6);
        l.newNodeLast(7);

        
        
        l.traversel();
        s.traverses();
    }
}
