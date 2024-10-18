package Complete_Linked_List;





class AddNode extends Node {
    public AddNode(int data) {
        super(data);
    }

    public void addNode(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        AddNode head = new AddNode(10);
        head.addNode(head, 20);
        head.addNode(head, 30);
        head.addNode(head, 40);
        head.addNode(head, 50);
        head.print(head);
    }
}

































