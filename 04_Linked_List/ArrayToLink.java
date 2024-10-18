package Complete_Linked_List;

class ArrayToLink extends Node {
    public ArrayToLink(int data) {
        super(data);
    }

    public Node arrayToLink(int[] arr) {
        Node newNode = new Node(-1);
        Node temp1 = newNode;
        for (int value : arr) {
            temp1.next = new Node(value);
            temp1 = temp1.next;
        }
        System.out.print("Linked List Created Successfully: ");
        return newNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayToLink arrayToLink = new ArrayToLink(0);
        Node head = arrayToLink.arrayToLink(arr);
        head.print(head);
    }
}