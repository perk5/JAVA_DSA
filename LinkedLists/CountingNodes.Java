class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    int countNodes(Node head){
        int count = 0;
        while(head != null){
            count += 1;
            head = head.next;
        }
        return count;
    }

}

class CountingNodes{
    public static void main(String args[]){
        Node head = new Node(6);
        Node node2 = new Node(3);
        Node node3 = new Node(1);
        Node node4 = new Node(5);
        Node node5 = new Node(8);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("You have " + head.countNodes(head) + " Nodes...");
    }
}