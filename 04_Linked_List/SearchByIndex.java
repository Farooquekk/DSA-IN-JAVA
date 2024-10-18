package Complete_Linked_List;

class SearchByIndex extends Node {
    public SearchByIndex(int data) {
        super(data);
    }

    public int searchByIndex(Node head, int idx) {
        if (idx <= 0 || idx > size(head)) {
            return -999;
        } else {
            Node temp = head;
            int i = 1;
            while (i < idx) {
                temp = temp.next;
                i++;
            }
            System.out.print("Element at index " + idx + ": ");
            return temp.data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        SearchByIndex searchByIndex = new SearchByIndex(0);
        System.out.println(searchByIndex.searchByIndex(head, 3));
    }
}