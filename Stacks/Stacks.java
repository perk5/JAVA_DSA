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

    void pop(){

        if(top == null){
           top = null; 
           return;
        }

        top = top.next;
       
        
    }

    String traverse(){
        Node current = top;
        String nodes= "";
        if(top == null){
            return "Empty List";
        }
        while(current != null){
            nodes = nodes + "[" + current.data + "]" + "->";
            current = current.next;
        }
        return nodes.substring(0,nodes.length() - 2 );
    }
}

class Stacks{
    public static void main(){
        StackHome s = new StackHome();
       
        s.insertElement(2);
        s.insertElement(3);
        s.insertElement(4);
        
        System.out.println(s.peak());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peak());
        // s.pop();
        System.out.println(s.traverse());  
    }
}