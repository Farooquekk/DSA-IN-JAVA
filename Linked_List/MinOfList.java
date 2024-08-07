package Complete_Linked_List;




class MinOfList extends Node {
    public MinOfList(int data) {
        super(data);
    }

    public int minOfList(Node head) {
        Node temp = head;
        int min = temp.data;
        while (temp != null) {
            if (min > temp.data) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        MinOfList minOfList = new MinOfList(0);
        System.out.println("Min of List: " + minOfList.minOfList(head));
    }
}