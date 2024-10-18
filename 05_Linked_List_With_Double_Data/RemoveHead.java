
public class RemoveHead {
    public static Node removeHead(Node head) {
        if (head == null) {
            System.out.println("Head is null");
        } else {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        head = removeHead(head);
       Node.print(head);
    }
}
