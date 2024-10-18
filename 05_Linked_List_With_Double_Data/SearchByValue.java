

public class SearchByValue {
    public static int searchByValue(Node head, int value1, String value2) {
        if (head == null) {
            System.out.println("List is null");
            return -999;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            idx++;
            if (temp.data1 == value1 && temp.data2.equals(value2)) {
                System.out.println(value1 + ", " + value2 + " found at index: " + idx);
                return idx;
            }
            temp = temp.next;
        }
        return -999;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        System.out.println("Search result: " + searchByValue(head, 20, "B"));
    }
}
