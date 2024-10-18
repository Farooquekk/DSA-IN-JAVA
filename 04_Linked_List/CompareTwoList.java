package Complete_Linked_List;

class CompareTwoList extends Node {
    public CompareTwoList(int data) {
        super(data);
    }

    public boolean compareTwoList(Node l1, Node l2) {
        if (l1.size(l1) != l2.size(l2)) {
            return false;
        } else {
            Node temp1 = l1;
            Node temp2 = l2;
            while (temp2 != null) {
                if (temp1.data != temp2.data) {
                    return false;
                }
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(10);
        l1 = AddAtLast.addAtLast(l1, 20);
        l1 = AddAtLast.addAtLast(l1, 30);
        Node l2 = new Node(10);
        l2 = AddAtLast.addAtLast(l2, 20);
        l2 = AddAtLast.addAtLast(l2, 30);
        CompareTwoList compareTwoList = new CompareTwoList(0);
        boolean areEqual = compareTwoList.compareTwoList(l1, l2);
        System.out.println("Are both lists equal? " + areEqual);
    }
}