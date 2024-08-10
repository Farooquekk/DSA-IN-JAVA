

public class ToString {
    public static String toString(Node head) {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            stringBuilder.append(temp.data1).append(" ").append(temp.data2).append(" ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        System.out.println("List as string: " + toString(head));
    }
}
