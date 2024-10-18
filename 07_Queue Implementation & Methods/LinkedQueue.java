package Queue;

public class LinkedQueue implements  Queue {



    public static class Node{
        Object data;
        Node next = this;
        Node prev = this;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head = new Node(" ");
    int size = 0;

    public boolean isEmpty(){
        return size==0;
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public Object first() {
        return head.next.data;
    }

    @Override
    public Object remove() {
        if(isEmpty()){
            throw new IllegalStateException("Queue Is Empty ");
        }
        Object temp = head.next.data;
        head.next=head.next.next;
        head.next.prev = head;
        --size;
        return temp;
    }

    @Override
    public void add(Object e) {
        head.prev.next = new Node(e,head.prev,head);
        head.prev = head.prev.next;
        ++size;
    }

    public boolean search(LinkedQueue l1 , Object target){
        Node  temp = l1.head;
        int size = l1.size();
        for(int i=0;i<size;i++){
           if(temp.data==target){
               return true;
           }
           temp=temp.next;

        }
        return false;


    }
    /*public void display(LinkedQueue l1) {
        Node temp1 = l1.head;
        Node temp2 = l1.head.next;
        while (temp1 != temp2) {
            System.out.print(temp2.data + " ");
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        System.out.print(" " + temp2.data);
        System.out.println();
    }*/
    public void display(LinkedQueue l1){
        int size = l1.size();
        Node temp = l1.head.next;
        System.out.print("Printing the Queue : ");
        for(int i=0;i<size;i++){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayReverse(LinkedQueue l1){

        int size = l1.size();
        Node current = l1.head.next;
        Node prev = null;
        Node next = null;
        for(int i=0;i<size;i++){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        System.out.print("Printing the Reverse Queue : ");
        while (prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }

        System.out.println();
    }



    public static void main(String[] args) {

        LinkedQueue stack = new LinkedQueue();
        stack.add("Imam");
        stack.add("Fakhar");
        stack.add("Babar");
        stack.add("Rizwan");
        stack.add("Sohail");
        stack.add("Faheem");
        stack.add("Imad");
        stack.add("Shadab");
        stack.add("Amir");
        stack.add("Shaheen");
        stack.add("Hassan");

        stack.display(stack);
        System.out.println(stack.search(stack,"Babar"));
        stack.displayReverse(stack);
        System.out.println(stack.size());
        System.out.println(stack.first());



    }




}
