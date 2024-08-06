package Complete_Linked_List;

import java.util.Random;

class GenerateRandom extends Node {
    public GenerateRandom(int data) {
        super(data);
    }

    public Node generateRandom(Node head) {
        Node newNode = new Node(-1);
        Node current = newNode;
        Node temp = head;

        Random random = new Random();

        while (temp != null) {
            int randomNumber = random.nextInt(100);
            current.next = new Node(randomNumber);
            current = current.next;
            temp = temp.next;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        GenerateRandom generateRandom = new GenerateRandom(0);
        head = generateRandom.generateRandom(head);
        head.print(head);
    }
}