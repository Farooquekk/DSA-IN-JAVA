package Complete_Linked_List;



class CloneList extends Node {
    public CloneList(int data) {
        super(data);
    }

    public Node cloneList(Node head) {
        Node newNode = new Node(-1);
        Node temp1 = newNode;
        Node temp = head;
        while (temp != null) {
            temp1.next = new Node(temp.data);
            temp = temp.next;
            temp1 = temp1.next;
        }
        System.out.print("Clone Created Successfully: ");
        return newNode.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        CloneList cloneList = new CloneList(0);
        Node clonedHead = cloneList.cloneList(head);
        clonedHead.print(clonedHead);
    }
}
