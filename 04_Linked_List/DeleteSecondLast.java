package Complete_Linked_List;

class DeleteSecondLast extends Node {
    public DeleteSecondLast(int data) {
        super(data);
    }

    public Node deleteSecondLast(Node head) {
        if (head == null || head.next == null) {
            System.out.println("Head is null now");
            return null;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node temp = head;
        while (temp.next.next.next != null) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        DeleteSecondLast deleteSecondLast = new DeleteSecondLast(0);
        head = deleteSecondLast.deleteSecondLast(head);
        head.print(head);
    }
}