package Queue;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

}

class QueueHome{
    Node front;
    Node rear;
    
    void enqueue(int data){
        Node new_node = new Node(data);
        if(rear == null){
            rear = new_node;
            front = rear; 
        }else{
            rear.next = new_node;
            rear = rear.next;
        }
    }

    boolean isempty(){
        return front == null;
    }

    void dequeue(){   
       if(front == null){
        return;
       }
       front = front.next;
    }
    
    void traverse(){
        Node fromFront = rear;
        while(fromFront != null){
            System.out.println(fromFront.data);
            fromFront = fromFront.next;
        }
    }
}

public class Queue {
    public static void main(){
        QueueHome q = new QueueHome();
        q.traverse();
        System.out.println(q.isempty());
    }
}
