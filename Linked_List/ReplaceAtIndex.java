package Complete_Linked_List;




class ReplaceAtIndex extends Node {
    public ReplaceAtIndex(int data) {
        super(data);
    }

    public Node replaceAtIndex(Node head, int idx, int data) {
        if (idx <= 0 || idx > size(head)) {
            System.out.println("List is Empty");
            return head;
        }
        Node temp = head;
        int i = 1;
        while (i < idx) {
            temp = temp.next;
            i++;
        }
        temp.data = data;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        ReplaceAtIndex replaceAtIndex = new ReplaceAtIndex(0);
        head = replaceAtIndex.replaceAtIndex(head, 3, 25);
        head.print(head);
    }
}