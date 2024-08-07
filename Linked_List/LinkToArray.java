package Complete_Linked_List;

class LinkToArray extends Node {
    public LinkToArray(int data) {
        super(data);
    }

    public int[] linkToArray(Node head) {
        int[] arr = new int[size(head)];
        Node temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        System.out.print("Array Created Successfully: ");
        return arr;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        LinkToArray linkToArray = new LinkToArray(0);
        int[] array = linkToArray.linkToArray(head);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}