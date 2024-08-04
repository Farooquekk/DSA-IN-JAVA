package Complete_Linked_List;

class Average extends Node {
    public Average(int data) {
        super(data);
    }

    public int average(Node head) {
        int size = size(head);
        SumOfList sumOfList = new SumOfList(0);
        int sum = sumOfList.sumOfList(head);
        return sum / size;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        Average average = new Average(0);
        System.out.println("Average: " + average.average(head));
    }
}
