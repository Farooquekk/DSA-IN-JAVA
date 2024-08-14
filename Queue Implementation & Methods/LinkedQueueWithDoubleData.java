package Queue;

public class LinkedQueueWithDoubleData {

    public static  class Node{
        String data1;
        int data2;
        Node prev = this;
        Node next = this;

        public Node(String data1, int data2) {
            this.data1 = data1;
            this.data2 = data2;
        }

        public Node(String data1, int data2, Node prev, Node next) {
            this.data1 = data1;
            this.data2 = data2;
            this.prev = prev;
            this.next = next;
        }
    }
    Node head = new Node(null,-1);
    int size = 0;

    public void add(String d1 , int d2){
        head.prev.next = new Node(d1,d2,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    public Object first(){
        return (head.next.data1+" "+head.next.data2);
    }
    public Object remove(){
        String r1 = head.next.data1;
        int r2 = head.next.data2;
        head.next=head.next.next;
        head.next.prev=head;
        --size;
        return (r1+ " " + r2);
    }
    public int size(){
        return size;
    }
    public boolean searchStringData(LinkedQueueWithDoubleData l1 , String data){
        Node temp = l1.head.next;
        for(int i=0;i<l1.size();i++){
            if(temp.data1==data){
                return true;
            }
        }
        return false;
    }
    public boolean searchIntData(LinkedQueueWithDoubleData l1 , int data){
        Node temp = l1.head.next;
        for(int i=0;i<l1.size();i++){
            if(temp.data2==data){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        Node temp = head.next;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<size();i++){
            stringBuilder.append(temp.data1+temp.data2);
            temp=temp.next;
        }
        return stringBuilder.toString();
    }
    public void print(LinkedQueueWithDoubleData l1){
        Node temp = l1.head.next;
        for(int i=0;i<l1.size();i++){
            System.out.print(temp.data1+" "+temp.data2+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueueWithDoubleData l1 = new LinkedQueueWithDoubleData();
        l1.add("Apple" , 200);
        l1.add("Orange" ,150);
        l1.add("Mango" , 250);
        l1.add("Grapes" , 300);
        l1.print(l1);
        System.out.println(l1.toString());
        System.out.println(l1.searchIntData(l1,200));
        System.out.println(l1.searchStringData(l1,"Apple"));
        System.out.println("Size : " + l1.size());
        System.out.println(l1.first());
        System.out.println(l1.remove());
        System.out.println(l1.first());
        System.out.println("Size : " + l1.size());



    }


}
