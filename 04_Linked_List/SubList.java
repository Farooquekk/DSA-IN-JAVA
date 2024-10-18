package Complete_Linked_List;

class SubList extends Node {
    public SubList(int data) {
        super(data);
    }

    public Node subList(Node head, int start, int end) {
        if (head == null || start <= 0 || start > size(head) || end <= 0 || end > size(head)) {
            System.out.println("Invalid");
            return null;
        }
        Node newNode = new Node(-1);
        Node temp1 = newNode;
        Node temp = head;
        int i = 1;
        while (i <= start - 1) {
            temp = temp.next;
            i++;
        }
        while (i <= end) {
            temp1.next = new Node(temp.data);
            temp = temp.next;
            temp1 = temp1.next;
            i++;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        SubList subList = new SubList(0);
        Node subHead = subList.subList(head, 2, 4);
        subHead.print(subHead);
    }
}
