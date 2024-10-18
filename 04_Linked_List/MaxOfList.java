package Complete_Linked_List;

class MaxOfList extends Node {
    public MaxOfList(int data) {
        super(data);
    }

    public int maxOfList(Node head) {
        Node temp = head;
        int max = temp.data;
        while (temp != null) {
            if (max < temp.data) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        MaxOfList maxOfList = new MaxOfList(0);
        System.out.println("Max of List: " + maxOfList.maxOfList(head));

    }  }