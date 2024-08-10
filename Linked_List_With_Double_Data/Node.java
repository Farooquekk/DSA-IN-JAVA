

public class Node {
    int data1;
    String data2;
    Node next;

    public Node(int data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
        this.next = null;
    }

    public static  void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data1 + " " + temp.data2 + "  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
