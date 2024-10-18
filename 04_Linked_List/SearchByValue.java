package Complete_Linked_List;

class SearchByValue extends Node {
    public SearchByValue(int data) {
        super(data);
    }

    public int searchByValue(Node head, int value) {
        if (head == null) {
            System.out.println("List is Null");
            return -999;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            idx++;
            if (temp.data == value) {
                System.out.print(value + " found at Index: ");
                return idx;
            }
            temp = temp.next;
        }
        return -999;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        SearchByValue searchByValue = new SearchByValue(0);
        System.out.println(searchByValue.searchByValue(head, 30));
    }
}