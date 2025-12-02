package Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int n){
        this.data = n;
    }

    int countsum(Node head){
        
        if(head == null){
            return 0;
        }
        return head.data + countsum(head.left) + countsum(head.right);

        // while(head != null){ 
        //     count += head.data;
        //         head = head.left;
        //     }
        // return count;
        
    }   

}

public class Trees {
    public static void main(String args[]){
        Node head = new Node(2);
        Node right1 = new Node(4);
        Node left1 = new Node(3);
        Node left2 = new Node(5);
        Node left3 = new Node(6);
        
        head.right = right1;
        head.left = left1;
        left1.left = left2;
        left1.right = left3;

        System.out.println(head.countsum(head));

    }
}
