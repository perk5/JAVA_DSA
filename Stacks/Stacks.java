package Stacks;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class StackHome{

    Node top = null;
    int n = 0; 
    int lastPopped = 0;

    boolean emptyStack(){
        return top == null;
    }

    void insertElement(int data){
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
        n = n + 1;
    }

    int peak(){
        if(top != null){
            return top.data;
        }
        return -1;
    }

    int pop(){
        if(emptyStack()){
            System.out.println("Empty List...");
            return 0;
        }
        lastPopped = top.data;
        top = top.next;  
        n = n - 1; 
        return top.data;  
    }

    // void undo(){
    //     if(top.next == null){
    //         System.out.println("Empty List...");
    //         lastPopped = 0;
    //         return;
    //     }
    //     pop();
    // }
    // void redo(){
    //     if(emptyStack()){
    //         System.out.println("Empty List...");
    //         return;
    //     }
    //     insertElement(lastPopped);
    // }
    void traverse(){
        Node current = top;
        // String nodes= "";
        if(emptyStack()){
            System.out.println("Empty List...");
            return;
        }
        while(current != null){
            System.out.println(current.data);
            // nodes = nodes + "[" + current.data + "]" + "->";
            current = current.next;
        }
        // return nodes.substring(0,nodes.length() - 2 );
    }
}

class Stacks{
    public static void main(){
        StackHome s = new StackHome();
       
        s.insertElement(1);
        s.insertElement(2);
        s.insertElement(3);
        s.insertElement(4);
        s.insertElement(5);
      
        s.traverse(); 
        // s.undo();
        // s.traverse(); 
         
    }
}