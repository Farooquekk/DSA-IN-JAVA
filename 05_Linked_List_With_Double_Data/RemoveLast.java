

public class RemoveLast {
    public static Node removeLast(Node head) {
        if (head == null) {
            System.out.println("Head is null");
            return head;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        head = removeLast(head);
        Node.print(head);
    }
}
