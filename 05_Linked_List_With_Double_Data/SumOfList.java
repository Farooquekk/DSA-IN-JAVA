

public class SumOfList {
    public static int sumOfList(Node head) {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.data1;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        System.out.println("Sum of list: " + sumOfList(head));
    }
}
