package Complete_Linked_List;

class InsertAtIncreasingOrder extends Node {
    public InsertAtIncreasingOrder(int data) {
        super(data);
    }

    public Node insertAtIncreasingOrder(Node head, int target) {
        Node newNode = new Node(target);
        if (head == null || head.data >= target) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < target) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        InsertAtIncreasingOrder insertAtIncreasingOrder = new InsertAtIncreasingOrder(0);
        head = insertAtIncreasingOrder.insertAtIncreasingOrder(head, 25);
        head.print(head);
    }
}