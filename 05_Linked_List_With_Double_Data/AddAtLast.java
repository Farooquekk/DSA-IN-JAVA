

public class AddAtLast {

    public static Node addAtLast(Node head, int data1, String data2) {
        Node newNode = new Node(data1, data2);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10, "A");
        head = AddAtLast.addAtLast(head, 20, "B");
        head = AddAtLast.addAtLast(head, 30, "C");
        Node.print(head);
    }
}
