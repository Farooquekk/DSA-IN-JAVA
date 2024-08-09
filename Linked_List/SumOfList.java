package Complete_Linked_List;



class SumOfList extends Node {
    public SumOfList(int data) {
        super(data);
    }

    public int sumOfList(Node head) {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        SumOfList sumOfList = new SumOfList(0);
        System.out.println("Sum of List: " + sumOfList.sumOfList(head));
    }
}