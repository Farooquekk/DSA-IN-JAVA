

public class AddNode {
    public static void addNode(Node head, int d1, String d2) {
        Node newNode = new Node(d1, d2);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static Node addAtHead(Node head, int d1, String d2) {
        Node newNode = new Node(d1, d2);
        if (head == null) {
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
            return head;
        }
    }

    public static Node addAtLast(Node head, int d1, String d2) {
        Node newNode = new Node(d1, d2);
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

    public static Node insertAtMiddle(Node head, int d1, String d2, int idx) {
        int size = Size.size(head);
        if (idx <= 0 || idx > size) {
            System.out.println("Invalid index");
            return head;
        }
        Node newNode = new Node(d1, d2);
        Node temp = head;
        int i = 1;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        addNode(head, 20, "B");
        addNode(head, 30, "C");
        addNode(head, 40, "D");
        addNode(head, 50, "E");

        head = addAtHead(head, 5, "AA");
        head = addAtLast(head, 60, "F");
        head = insertAtMiddle(head, 35, "CC", 4);

        Node.print(head);
    }
}
