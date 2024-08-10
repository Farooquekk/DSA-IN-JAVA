
public class SplitList {
    public static void splitList(Node head) {
        if (head == null) {
            System.out.println("List is null");
            return;
        }
        Node evenList = new Node(-2, " ");
        Node evenTemp = evenList;
        Node oddList = new Node(-1, " ");
        Node oddTemp = oddList;

        Node temp = head;
        while (temp != null) {
            if (temp.data1 % 2 == 0) {
                evenTemp.next = new Node(temp.data1, temp.data2);
                evenTemp = evenTemp.next;
            } else {
                oddTemp.next = new Node(temp.data1, temp.data2);
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }
        System.out.println("Linked List Split Successfully:");
        System.out.println("Even List:");
        Node.print(evenList.next);
        System.out.println("Odd List:");
        Node.print(oddList.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10, "A");
        AddNode.addNode(head, 21, "B");
        AddNode.addNode(head, 30, "C");
        AddNode.addNode(head, 41, "D");

        splitList(head);
    }
}
