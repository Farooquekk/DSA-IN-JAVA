

public class SearchByIndex {
    public static void searchByIndex(Node head, int idx) {
        int size = Size.size(head);
        if (idx <= 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        } else {
            Node temp = head;
            int i = 1;
            while (i < idx) {
                temp = temp.next;
                i++;
            }
            System.out.println("Element at index " + idx + ": " + temp.data1 + " " + temp.data2);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        searchByIndex(head, 2);
    }
}
