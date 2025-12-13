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

    String traverse(){
        Node current = top;
        String nodes= "";
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
        System.out.println(s.emptyStack());
        s.insertElement(2);
        s.insertElement(3);
        s.insertElement(4);
        System.out.println(s.emptyStack());
        System.out.println(s.traverse());
        
    }
}