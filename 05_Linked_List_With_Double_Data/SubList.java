

public class SubList {
    public static Node subList(Node head, int start, int end) {
        int size = Size.size(head);
        if (head == null || start <= 0 || end <= 0 || end > size || start > end) {
            System.out.println("Invalid range");
            return null;
        }
        Node newNode = new Node(-1, " ");
        Node temp1 = newNode;
        Node temp = head;
        int i = 1;
        while (i < start) {
            temp = temp.next;
            i++;
        }
        while (i <= end) {
            temp1.next = new Node(temp.data1, temp.data2);
            temp = temp.next;
            temp1 = temp1.next;
            i++;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");
        AddNode.addNode(head, 40, "D");

        Node subList = subList(head, 2, 3);
        Node.print(subList);
    }
}
