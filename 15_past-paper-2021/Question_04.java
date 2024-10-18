package pastpaper_2021;

public class Question_04 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public int sum(Node head){
        Node temp = head;
        int sum = 0;
        while (temp!=null){
            sum+=temp.data;
            temp=temp.next;

        }
        return sum;
    }
    public boolean search(Node head  , int data){
        Node temp = head;
        while (temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public Node merge(Node n1 , Node n2 ){
        Node temp1 = n1;
        Node temp2 = n2;
        while (temp1.next!=null){
            temp1=temp1.next;
        }

        while (temp2!=null){
            temp1.next= new Node(temp2.data);
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return n1;
    }
    public void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question_04  q4 = new Question_04();
        Node n1 = new Node(5);
        Node n3 = new Node(7);
        n1.next=n3;
        Node n2 = new Node(10);
       n1 = q4.merge(n1,n2);
        q4.print(n1);


    }
}
