package Complete_Linked_List;

class DeleteMiddle extends Node {
    public DeleteMiddle(int data) {
        super(data);
    }

    public Node deleteMiddle(Node head) {
        int size = size(head) / 2;
        Node temp = head;
        int i = 1;
        while (i < size) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        DeleteMiddle deleteMiddle = new DeleteMiddle(0);
        head = deleteMiddle.deleteMiddle(head);
        head.print(head);
    }
}
