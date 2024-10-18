package Complete_Linked_List;

class RemoveLast extends Node {
    public RemoveLast(int data) {
        super(data);
    }

    public Node removeLast(Node head) {
        if (head == null) {
            System.out.println("Head is Null");
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        RemoveLast removeLast = new RemoveLast(0);
        head = removeLast.removeLast(head);
        head.print(head);
    }
}