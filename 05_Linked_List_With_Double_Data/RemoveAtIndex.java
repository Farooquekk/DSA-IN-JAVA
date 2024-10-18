

public class RemoveAtIndex {
    public static Node removeAtIndex(Node head, int idx) {
        int size = Size.size(head);
        if (head == null || idx <= 0 || idx > size) {
            System.out.println("Invalid index");
            return head;
        }
        if (idx == 1) {
            return RemoveHead.removeHead(head);
        }
        Node temp = head;
        int i = 1;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        head = removeAtIndex(head, 2);
        Node.print(head);
    }
}
