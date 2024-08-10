

public class MaxOfList {
    public static int maxOfList(Node head) {
        Node temp = head;
        int max = temp.data1;
        while (temp != null) {
            if (max < temp.data1) {
                max = temp.data1;
            }
            temp = temp.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        System.out.println("Max of list: " + maxOfList(head));
    }
}
