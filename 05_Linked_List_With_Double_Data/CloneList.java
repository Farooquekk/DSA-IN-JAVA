

public class CloneList {
    public static Node cloneList(Node head) {
        Node newNode = new Node(-1, " ");
        Node temp1 = newNode;
        Node temp = head;
        while (temp != null) {
            temp1.next = new Node(temp.data1, temp.data2);
            temp = temp.next;
            temp1 = temp1.next;
        }
        System.out.print("Clone Created Successfully: ");
        return newNode.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 20, "B");
        AddNode.addNode(head, 30, "C");

        Node clonedList = cloneList(head);
        Node.print(clonedList);
    }
}
