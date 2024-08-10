import java.util.Objects;

public class CompareTwoList {
    public static boolean compareTwoList(Node l1, Node l2) {
        if (Size.size(l1) != Size.size(l2)) {
            return false;
        } else {
            Node temp1 = l1;
            Node temp2 = l2;
            while (temp2 != null) {
                if (temp1.data1 != temp2.data1 && !Objects.equals(temp1.data2, temp2.data2)) {
                    return false;
                }
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(10, "A");
        AddNode.addNode(l1, 20, "B");
        AddNode.addNode(l1, 30, "C");

        Node l2 = CloneList.cloneList(l1);

        System.out.println("Are both lists equal: " + compareTwoList(l1, l2));
    }
}
