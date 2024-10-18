package Complete_Linked_List;

class SplitList extends Node {
    public SplitList(int data) {
        super(data);
    }

    public void splitList(Node head) {
        if (head == null) {
            System.out.println("List is Null");
            return;
        }
        Node temp = head;
        Node evenList = new Node(-2);
        Node evenTemp = evenList;
        Node oddList = new Node(-1);
        Node oddTemp = oddList;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenTemp.next = new Node(temp.data);
                evenTemp = evenTemp.next;
            } else {
                oddTemp.next = new Node(temp.data);
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }
        System.out.print("Even List: ");
        evenList.next.print(evenList.next);
        System.out.print("Odd List: ");
        oddList.next.print(oddList.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 15);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 25);
        head = AddAtLast.addAtLast(head, 30);
        SplitList splitList = new SplitList(0);
        splitList.splitList(head);
    }
}
