package Complete_Linked_List;

class DeleteIncreasingOrder extends Node {
    public DeleteIncreasingOrder(int data) {
        super(data);
    }

    public Node deleteIncreasingOrder(Node head, int target) {
        if (head == null) {
            System.out.println("Head is null");
            return head;
        }
        if (head.data == target) {
            return head.next;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Target not found in the list");
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        DeleteIncreasingOrder deleteIncreasingOrder = new DeleteIncreasingOrder(0);
        head = deleteIncreasingOrder.deleteIncreasingOrder(head, 20);
        head.print(head);
    }
}
