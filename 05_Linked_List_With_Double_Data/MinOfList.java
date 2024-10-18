
public class MinOfList {
    public static int minOfList(Node head) {
        Node temp = head;
        int min = temp.data1;
        while (temp != null) {
            if (min > temp.data1) {
                min = temp.data1;
            }
            temp = temp.next;
        }
        return min;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        System.out.println("Min of list: " + minOfList(head));
    }
}
