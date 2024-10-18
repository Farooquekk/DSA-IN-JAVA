package Complete_Linked_List;

class RemoveHead extends Node {
    public RemoveHead(int data) {
        super(data);
    }

    public Node removeHead(Node head) {
        if (head == null) {
            System.out.println("Head is Null");
            return head;
        } else {
            if (head.next == null) {
                System.out.println("List has only one element which got removed");
                head = head.next;
            }
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        RemoveHead removeHead = new RemoveHead(0);
        head = removeHead.removeHead(head);
        head.print(head);
    }
}