

public class DeleteSecondLast {
    public static Node deleteSecondLast(Node head) {
        if (head == null || head.next == null) {
            System.out.println("List is too short");
            return head;
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
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");
        AddNode.addNode(head, 40, "D");

        head = deleteSecondLast(head);
        Node.print(head);
    }
}
