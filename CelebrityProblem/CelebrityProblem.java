package CelebrityProblem;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class CelebHome {
    Node top = null;
    int n = 0;

    boolean emptyStack() {
        return top == null;
    }

    void insertElement(int data) {
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
        n = n + 1;
    }

    int size() {
        return n;
    }

    int pop() {
        if (emptyStack()) {
            System.out.println("Empty List...");
        }
        int popped = top.data;
        top = top.next;
        n = n - 1;
        return popped;
    }

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

public class CelebrityProblem {

    public static void main() {
        
        int[][] matrix = {
            { 0, 0, 1, 1 }, //0
            { 0, 0, 1, 0 }, //1
            { 0, 0, 0, 0 }, //2
            { 0, 0, 1, 0 } //3
        };
        CelebHome s = new CelebHome();

        for (int i = 0; i < matrix.length; i++) {
            s.insertElement(i);
        }

        while(s.size() >= 2){
            int i = s.pop();
            int j = s.pop();

            if(matrix[i][j] == 0){
                s.insertElement(i);
            }else{
                s.insertElement(j);
            }  
        } 
        int celeb = s.pop(); //2

        for(int i = 0; i < matrix.length; i++){
            if(i != celeb){
                if(matrix[i][celeb] == 0 || matrix[celeb][i] == 1){
                    System.out.println("No one is a celebrity..");
                    return;
                }
            }
        }
        System.out.println(celeb + " is a celebrity");
                  
    }

}
