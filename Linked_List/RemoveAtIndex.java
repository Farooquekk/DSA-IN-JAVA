
package Complete_Linked_List;

class RemoveAtIndex extends Node {
    public RemoveAtIndex(int data) {
        super(data);
    }

    public Node removeAtIndex(Node head, int idx) {
        if (head == null) {
            System.out.println("Head is Null");
            return head;
        } else {
            int i = 1;
            Node temp = head;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        RemoveAtIndex removeAtIndex = new RemoveAtIndex(0);
        head = removeAtIndex.removeAtIndex(head, 3);
        head.print(head);
    }
}