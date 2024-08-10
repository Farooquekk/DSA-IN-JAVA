

public class ReplaceAtIndex {
    public static Node replaceAtIndex(Node head, int idx, int data1, String data2) {
        int size = Size.size(head);
        if (idx <= 0 || idx > size) {
            System.out.println("Invalid index");
            return head;
        }
        Node temp = head;
        int i = 1;
        while (i < idx) {
            temp = temp.next;
            i++;
        }
        temp.data1 = data1;
        temp.data2 = data2;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        replaceAtIndex(head, 2, 25, "BB");
        Node.print(head);
    }
}
